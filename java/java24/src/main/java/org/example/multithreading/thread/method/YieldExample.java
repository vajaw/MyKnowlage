package org.example.multithreading.thread.method;

public class YieldExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "正在运行：" + i);
                Thread.yield();
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "正在运行：" + i);
            }
        };

        Thread thread1 = new Thread(runnable, "线程1");
        Thread thread2 = new Thread(runnable2, "线程2");

        thread1.start();
        thread2.start();
    }
}
