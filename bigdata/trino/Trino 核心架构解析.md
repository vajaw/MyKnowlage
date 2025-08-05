# Trino 核心架构解析
Trino 是一个 分布式 MPP（Massively Parallel Processing）SQL 查询引擎，其设计目标是 高性能、低延迟、联邦查询。以下是其核心架构的详细分解：
## 1. 分层架构概览
Trino 的架构分为三层：
```bash
  Coordinator（协调节点）
  Worker（工作节点）
  Connector（连接器层）
```
## 2. 核心组件详解
### （1）Coordinator（协调节点）
- 角色：接收客户端请求，管理查询执行流程。
- 核心功能：
-- SQL 解析：将 SQL 转换为逻辑计划（Logical Plan）。
-- 查询优化：基于成本优化器（Cost-Based Optimizer, CBO）生成分布式执行计划。
-- 任务调度：将任务分发给 Worker 节点。
-- 资源管理：通过 Resource Groups 控制并发查询的资源分配。
- 关键模块：
SqlParser → Analyzer → Optimizer → Scheduler
