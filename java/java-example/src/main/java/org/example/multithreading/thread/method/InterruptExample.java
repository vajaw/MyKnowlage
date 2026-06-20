package org.example.multithreading.thread.method;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // 当线程没被中断
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("线程正在运行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("线程被中断");
                    Thread.currentThread().interrupt(); // 再次设置中断状态
                }
            }
        });

        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); // 中断线程
    }
}

