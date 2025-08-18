## System.getProperty()
在 Linux 系统中，`System.getProperty()` 方法读取的是 **JVM（Java 虚拟机）启动时从操作系统或命令行参数中获取的系统属性**。这些属性包括操作系统信息、JVM 配置、文件系统路径等。以下是具体分类和说明：

---

### **1. 操作系统相关属性**
这些属性直接从 Linux 内核或系统环境中获取：

| **属性 Key**         | **描述**                          | **Linux 示例值**               |
|----------------------|----------------------------------|-------------------------------|
| `os.name`            | 操作系统名称                     | `"Linux"`                     |
| `os.version`         | 内核版本                         | `"5.15.0-76-generic"`         |
| `os.arch`            | 系统架构                         | `"amd64"`（64 位）            |
| `file.separator`     | 文件路径分隔符                   | `"/"`                         |
| `path.separator`     | PATH 环境变量分隔符              | `":"`                         |
| `line.separator`     | 行分隔符（换行符）               | `"\n"`                        |

---

### **2. JVM 和 Java 运行时属性**
这些属性由 JVM 自身提供：

| **属性 Key**         | **描述**                          | **Linux 示例值**               |
|----------------------|----------------------------------|-------------------------------|
| `java.version`       | Java 版本                        | `"17.0.7"`                    |
| `java.home`          | JRE 安装目录                     | `"/usr/lib/jvm/java-17-openjdk"` |
| `java.class.path`    | 应用的 classpath                 | `".:/usr/share/java/*"`        |
| `java.io.tmpdir`     | 临时文件目录                     | `"/tmp"`                      |

---

### **3. 用户和环境相关属性**
| **属性 Key**         | **描述**                          | **Linux 示例值**               |
|----------------------|----------------------------------|-------------------------------|
| `user.name`          | 当前用户名                       | `"ubuntu"`                    |
| `user.home`          | 用户主目录                       | `"/home/ubuntu"`              |
| `user.dir`           | 当前工作目录                     | `"/home/ubuntu/projects"`     |

---

### **4. 动态设置的属性**
通过 `-D` 参数传递给 JVM 的自定义属性：
```bash
java -Dmy.custom.property=hello -jar app.jar
```
在代码中读取：
```java
String value = System.getProperty("my.custom.property"); // "hello"
```

---

### **5. 如何查看所有系统属性？**
运行以下 Java 代码可打印所有属性：
```java
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
```
输出示例（部分）：
```
os.name = Linux
os.version = 5.15.0-76-generic
user.home = /home/ubuntu
java.home = /usr/lib/jvm/java-17-openjdk
...
```

---

### **6. 在 Linux 中的底层来源**
- **操作系统属性**（如 `os.name`）：  
  由 JVM 通过调用 Linux 系统函数（如 `uname()`）获取。
- **环境变量**（如 `user.home`）：  
  部分属性（如 `user.home`）会读取 Linux 的环境变量（如 `$HOME`）。
- **JVM 默认值**（如 `file.separator`）：  
  JVM 根据 Linux 系统特性硬编码默认值（如路径分隔符 `/`）。

---

