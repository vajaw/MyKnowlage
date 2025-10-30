package org.example.multithreading.thread.method.sync;

class SyncCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) {
        SyncCounter counter = new SyncCounter();

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            // 等待 thread1 结束
            thread1.join();
            // 等待 thread2 结束
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终计数值: " + counter.getCount());
    }
}

