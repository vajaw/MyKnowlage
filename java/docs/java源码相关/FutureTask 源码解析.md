`FutureTask<V>` 是 Java 中一个非常重要的类，它既是一个 **`Future`**，可以返回任务的结果；又是一个 **`Runnable`**，可以被线程执行。带着疑问查看一下解析：为什么 FutureTask 能被 Thread 运行？

---

### **1. `FutureTask` 类的定义**
`FutureTask` 实现了两个接口：
```java
public class FutureTask<V> implements RunnableFuture<V> {
    // 省略内部实现
}
```

其中：
- **`RunnableFuture<V>`** 是一个接口，定义如下：
  ```java
  public interface RunnableFuture<V> extends Runnable, Future<V> {
      void run();
  }
  ```
  - `RunnableFuture<V>` 继承了 **`Runnable`** 和 **`Future<V>`** 接口。
  - 因此，`FutureTask<V>` 需要同时实现 `Runnable` 和 `Future` 的功能。

---

### **2. 如何实现 `Runnable` 接口**

- `FutureTask.run()` 的核心逻辑是执行其包装的任务（`Callable<V>`），并记录任务的结果或异常。简化后的源码如下：
  ```java
  public void run() {
      if (state != NEW || !UNSAFE.compareAndSwapInt(this, stateOffset, NEW, COMPLETING))
          return; // 确保任务只能执行一次

      Callable<V> callable = this.callable; // 包装的任务
      if (callable != null) {
          try {
              // 执行任务，获取结果
              V result = callable.call();
              // 设置任务结果
              set(result);
          } catch (Throwable ex) {
              // 捕获异常并保存
              setException(ex);
          }
      }
  }
  ```
  - `state` 用于表示任务的状态（如 NEW、COMPLETING、COMPLETED）。
  - `callable.call()` 是任务的核心逻辑，执行后返回结果。
  - `set(result)` 保存结果。
  - 如果任务抛出异常，则调用 `setException(ex)` 保存异常信息。

因此，通过实现 `run()` 方法，`FutureTask` 成为了一个可以被线程执行的任务。

---

### **3. 如何实现 `Future` 接口**
- `Future` 接口的核心是定义了方法来检查任务的状态、获取结果、取消任务等功能。其主要方法包括：
  ```java
  public interface Future<V> {
      boolean cancel(boolean mayInterruptIfRunning);
      boolean isCancelled();
      boolean isDone();
      V get() throws InterruptedException, ExecutionException;
      V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException;
  }
  ```

- 在 `FutureTask` 中，通过实现这些方法来提供异步获取结果的功能。以下是一些关键方法的实现：

#### **(1) `isDone()`**
- 检查任务是否完成：
  ```java
  public boolean isDone() {
      return state != NEW; // 如果状态不是 NEW，则任务已完成
  }
  ```

#### **(2) `get()`**
- 获取任务执行的结果（如果未完成，则阻塞）：
  ```java
  public V get() throws InterruptedException, ExecutionException {
      awaitDone(); // 等待任务完成
      return report(); // 返回结果或抛出异常
  }
  ```
- `awaitDone()` 会阻塞直到任务完成。
- `report()` 会检查 `outcome`：
  - 如果是结果，则返回结果。
  - 如果是异常，则抛出异常。

#### **(3) `cancel()`**
- 取消任务的执行：
  ```java
  public boolean cancel(boolean mayInterruptIfRunning) {
      if (!compareAndSetState(NEW, CANCELLED)) // 改变任务状态为 CANCELLED
          return false;
      if (mayInterruptIfRunning) { 
          // 尝试中断任务
          Thread t = runner;
          if (t != null)
              t.interrupt();
      }
      finishCompletion(); // 完成取消流程
      return true;
  }
  ```

---

### **4. `FutureTask` 的设计巧妙之处**
`FutureTask` 能同时满足 `Runnable` 和 `Future` 的功能需求，主要依赖于以下设计：

#### **(1) 任务的包装**
- `FutureTask` 通过组合一个 `Callable<V>` 对象来包装任务逻辑：
  ```java
  private Callable<V> callable; // 包装的任务
  ```
- `Callable<V>` 是一个可以返回结果的任务接口：
  ```java
  public interface Callable<V> {
      V call() throws Exception;
  }
  ```
- 通过调用 `callable.call()`，可以执行任务并获取结果。

#### **(2) 结果的存储**
- `FutureTask` 使用内部字段 `outcome` 来存储任务的结果或异常：
  ```java
  private Object outcome; // 任务的结果或异常
  ```
- 成功时，`outcome` 保存结果：
  ```java
//  outcome = result;
  ```
- 失败时，`outcome` 保存异常：
  ```java
//  outcome = new ExecutionException(ex);
  ```
#### **(3) 线程的包装**
- `FutureTask` 通过组合一个 `Thread` 对象来包装线程逻辑：
  ```java
  private volatile Thread runner; // 包装的线程
  ```

#### **(4) 任务的状态管理**
- `FutureTask` 使用一个 `state` 字段来管理任务的状态：
  ```java
  private volatile int state; // 任务状态
  ```
- 任务的状态包括：
  - `NEW`：任务尚未开始。
  - `COMPLETING`：任务正在完成。
  - `COMPLETED`：任务已完成。
  - `CANCELLED`：任务已取消。
  - `EXCEPTIONAL`：任务抛出了异常。

- 通过原子操作（`compareAndSetState`）保证状态的线程安全。

#### **(5) 多线程的支持**
- `FutureTask` 使用线程安全的机制（如 `CAS` 和 `volatile`）来确保在多线程环境下的正确性。
- `run()` 方法会将任务的结果或异常存储到共享变量中，`get()` 方法会阻塞直到任务完成。

---

### **5. 总结**

`FutureTask` 通过实现 `Runnable` 和 `Future` 接口，同时提供了以下功能：
- 作为 `Runnable`，可以提交到线程池或直接在线程中执行。
- 作为 `Future`，可以异步地获取任务的结果或处理异常。

这种双向功能的实现基于以下机制：
1. **任务的包装**：通过 `Callable<V>` 包装任务逻辑。
2. **结果的存储**：通过 `outcome` 存储任务的结果或异常。
3. **状态管理**：通过 `state` 管理任务的状态，确保线程安全。
4. **组合接口**：通过 `RunnableFuture<V>` 接口，结合了 `Runnable` 和 `Future` 的功能。

读到这里，应该可以解答为什么 FutureTask 可以被 Thread 运行，因为 FutureTask 包装了 Callable ，
实现了 Runnable的 run 方法， 并在 run 方法内调用 Callable 的 call 方法实现返回结果的能力。
因此 Future 不仅可以返回结果，而且也能被 Thread 运行。