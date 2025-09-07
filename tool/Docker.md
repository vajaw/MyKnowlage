# Docker 常用命令速查表
## 常用命令

### 1、镜像 (images)

#### 查看本地镜像
```bash
docker images
```

#### 搜索镜像
```bash
docker search <镜像名>
```

#### 拉取镜像
```bash
docker pull <镜像名>:<tag>
```

#### 删除镜像
```bash
docker rmi <镜像ID>
```

#### 给镜像打标签
```bash
docker tag <镜像ID> <新镜像名>:<tag>
```

#### 保存镜像为文件
```bash
docker save -o <文件名>.tar <镜像名>:<tag>
```

#### 从文件加载镜像
```bash
docker load -i <文件名>.tar
```

---

### 2、容器 (containers)

#### 查看正在运行的容器
```bash
docker ps
```

#### 查看所有容器（含已停止）
```bash
docker ps -a
```

#### 启动容器
```bash
docker start <容器ID/名称>
```

#### 停止容器
```bash
docker stop <容器ID/名称>
```

#### 删除容器
```bash
docker rm <容器ID/名称>
```

#### 运行容器
```bash
docker run -d -p <宿主端口>:<容器端口> --name <容器名> <镜像名>
```

#### 进入容器
```bash
docker exec -it <容器ID/名称> /bin/bash
```

#### 查看容器日志
```bash
docker logs -f <容器ID/名称>
```

#### 拷贝文件 (宿主机 ↔ 容器)
```bash
docker cp <宿主机路径> <容器ID>:/<容器路径>
docker cp <容器ID>:/<容器路径> <宿主机路径>
```

---

### 3、网络 (network)

#### 查看网络
```bash
docker network ls
```

#### 创建网络
```bash
docker network create <网络名>
```

#### 删除网络
```bash
docker network rm <网络名>
```

#### 查看网络详情
```bash
docker network inspect <网络名>
```

#### 将容器加入网络
```bash
docker network connect <网络名> <容器ID/名称>
```

#### 将容器移出网络
```bash
docker network disconnect <网络名> <容器ID/名称>
```

---

### 4、数据卷 (volumes)

#### 查看数据卷
```bash
docker volume ls
```

#### 创建数据卷
```bash
docker volume create <卷名>
```

#### 删除数据卷
```bash
docker volume rm <卷名>
```

#### 查看数据卷详情
```bash
docker volume inspect <卷名>
```

#### 运行容器挂载数据卷
```bash
docker run -d -v <卷名>:<容器路径> <镜像名>
```

---

### 5、Docker Compose

#### 启动
```bash
docker-compose up -d
```

#### 停止
```bash
docker-compose down
```

#### 查看服务日志
```bash
docker-compose logs -f
```

#### 进入容器
```bash
docker-compose exec <服务名> /bin/bash
```

---

### 6、日常清理与排错

#### 删除所有已停止容器
```bash
docker container prune
```

#### 删除所有无用镜像
```bash
docker image prune -a
```

#### 删除所有无用网络
```bash
docker network prune
```

#### 删除所有无用数据卷
```bash
docker volume prune
```

#### 一键清理所有无用资源
```bash
docker system prune -a
```

## 搭配使用

### 运行容器并指定固定 IP 地址
#### 1. 创建自定义网络并指定子网
```bash
docker network create --subnet=172.19.0.0/16 mynet
```
#### 2. 运行容器并指定 IP 地址
```bash
docker run -d --name mynginx \
  -p 8080:80 \
  --net mynet \
  --ip 172.19.0.10 \
  nginx
```
