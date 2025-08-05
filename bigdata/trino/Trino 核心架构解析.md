# Trino 核心架构解析
Trino 是一个 分布式 MPP（Massively Parallel Processing）SQL 查询引擎，其设计目标是 高性能、低延迟、联邦查询。以下是其核心架构的详细分解：
## 1. 分层架构概览
Trino 的架构分为三层：

- Coordinator（协调节点）
- Worker（工作节点）
- Connector（连接器层）
![export_chs9gqm.png](/sources/png/export_chs9gqm.png)
  
## 2. 核心组件详解
### （1）Coordinator（协调节点）
- 角色：接收客户端请求，管理查询执行流程。
- 核心功能：
  - SQL 解析：将 SQL 转换为逻辑计划（Logical Plan）。
  - 查询优化：基于成本优化器（Cost-Based Optimizer, CBO）生成分布式执行计划。
  - 任务调度：将任务分发给 Worker 节点。
  - 资源管理：通过 Resource Groups 控制并发查询的资源分配。
- 关键模块：
SqlParser → Analyzer → Optimizer → Scheduler 

示例流程：
```sql
-- 客户端提交查询
SELECT * FROM hive.test JOIN postgresql.public.users ON hive.test.id = users.id;
-- Coordinator 负责解析、优化、分发给 Worker。
```
### （2）Worker（工作节点）
- 角色：执行实际的计算任务。
- 核心功能：
  - 并行处理：每个 Worker 处理数据的一个分片（Split）。
  - 算子执行：运行 Scan、Filter、Join、Aggregation 等算子。
  - 数据交换：通过 Exchange 算子完成 Shuffle（数据混洗）。
- 关键特性：
  - 流水线执行：避免等待单个阶段完成，提升吞吐量。
  - 内存计算：数据优先驻留内存，减少磁盘 I/O。

Worker 内部执行流程：
```
Task -> Split -> Operator (Scan -> Filter -> Join -> Aggregate) -> Exchange
```
