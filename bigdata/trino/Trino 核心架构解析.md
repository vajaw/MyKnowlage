# Trino 核心架构解析
Trino 是一个 分布式 MPP（Massively Parallel Processing）SQL 查询引擎，其设计目标是 高性能、低延迟、联邦查询。以下是其核心架构的详细分解：
***
## 1. 分层架构概览
Trino 的架构分为三层：
  <img align="right" src= "/sources/png/export_chs9gqm.png" width ="300px">
- Coordinator（协调节点）
- Worker（工作节点）
- Connector（连接器层）
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
## （3）Connector（连接器层）
- 角色：抽象不同数据源的访问接口，实现联邦查询。
- 工作原理：
  - 每个数据源（如 Hive、MySQL、Iceberg）需实现 Connector API。
  - 关键接口：
    - ConnectorMetadata（元数据管理）
    - ConnectorSplitManager（数据分片划分）
    - ConnectorPageSource（数据读取）
    - ConnectorPageSink（数据写入）

支持的连接器（部分）：

|数据源类型|	连接器名称|	关键能力|
| ------------ | ------------- |------------- |
|数据湖|iceberg	|ACID、Time Travel|
|关系型数据库|mysql/jdbc|谓词下推、并行扫描|
|大数据存储|hive|分区裁剪、统计信息|
|消息队列|kafka|流式摄取|

## 3. 查询执行流程
### （1）查询生命周期
- 客户端提交 SQL（通过 JDBC/CLI/HTTP）。
- Coordinator 解析：生成语法树 → 逻辑计划。
- 优化器优化：
  - 谓词下推、动态过滤（Dynamic Filtering）。
  - 选择 JOIN 策略（Broadcast Hash Join / Partitioned Join）。
- 分布式执行计划：
  - 拆解为 Stage → Task → Split。
- Worker 执行：
  - 每个 Task 处理多个 Split，通过 Exchange 交换数据。
- 结果返回：由 Coordinator 汇总结果。
### （2）执行计划示例
SQL
```SQL
EXPLAIN 
SELECT * 
FROM hive.orders 
JOIN mysql.customers 
ON orders.cid = customers.id;
```
输出：
```TEXT
Fragment 0 (Coordinator)
│   Output: order_id, customer_name
└─ Fragment 1 (Hive Scan)  
│   TableScan: hive.orders  
└─ Fragment 2 (MySQL Scan + Join)  
│   LocalExchange: Hash[cid]  
└─ RemoteExchange: REPARTITION  
└─ TableScan: mysql.customers
```
## 4. 容错与扩展性
### （1）容错机制
- 快速失败（Fail Fast）：默认不重试（适合 OLAP 场景）。
- 可选的查询重试：通过 query.retry-policy 配置。
- Worker 宕机处理：Coordinator 重新调度受影响的任务。
### （2）横向扩展
- 无状态 Worker：可动态增加/减少节点。
- Kubernetes 友好：支持 Helm Chart 部署（Trino Operator）。