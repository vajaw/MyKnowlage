package org.example.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) {
        // 创建 Callable 任务
        Callable<Integer> task = () -> {
            System.out.println("子线程正在执行任务...");
            Thread.sleep(2000); // 模拟耗时操作
            return 42; // 返回结果
        };

        // 创建 FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(task);

        // 创建并启动线程
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // 获取任务结果
            Integer result = futureTask.get();
            System.out.println("任务执行结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
