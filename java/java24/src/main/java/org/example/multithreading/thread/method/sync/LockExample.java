package org.example.multithreading.thread.method.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockCounter
{
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

public class LockExample {
    public static void main(String[] args) {
        LockCounter counter = new LockCounter();

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
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终计数值: " + counter.getCount());
    }
}

