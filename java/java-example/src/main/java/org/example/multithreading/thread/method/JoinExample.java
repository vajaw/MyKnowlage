package org.example.multithreading.thread.method;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程：" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread.join(); // 主线程等待子线程完成
        System.out.println("子线程运行结束，主线程继续运行");
    }
}
