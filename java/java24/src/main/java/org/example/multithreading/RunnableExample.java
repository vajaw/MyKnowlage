package org.example.multithreading;

// 创建一个实现 Runnable 的类
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("线程 MyRunnable 正在运行：" + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // 创建 Runnable 对象
        MyRunnable runnable = new MyRunnable();
        // 创建线程对象，并传入 Runnable
        Thread thread = new Thread(runnable);
        // 启动线程
        thread.start();
    }
}
