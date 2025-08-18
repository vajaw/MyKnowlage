package org.example.multithreading;

// 定义一个线程类
class MyThread extends Thread {
    @Override
    public void run() {
        // 线程要执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("线程 MyThread 正在运行：" + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread thread = new MyThread();
        // 启动线程
        thread.start();
    }
}
