package org.example.multithreading.thread.method;

public class SleepExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程正在运行：" + i);
            try {
                Thread.sleep(1000); // 休眠 1 秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

