package org.example.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        // 创建一个 Callable 实现类
        Callable<Integer> task = () -> {
            System.out.println("子线程正在执行任务...");
            Thread.sleep(2000); // 模拟耗时操作
            return 123; // 返回结果
        };

        // 创建线程池
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // 提交任务，返回 Future 对象
        Future<Integer> result = executor.submit(task);

        try {
            // 获取任务的返回值（阻塞，直到任务完成）
            Integer value = result.get();
            System.out.println("任务执行结果：" + value);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 关闭线程池
        executor.shutdown();
    }
}
