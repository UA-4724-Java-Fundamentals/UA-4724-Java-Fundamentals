package com.softserve.academy.homework15;

import java.util.concurrent.*;

public class Example2 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(3000);
            return "Task result";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Waiting for result...");
        String result = future.get(); // блокує до завершення
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}