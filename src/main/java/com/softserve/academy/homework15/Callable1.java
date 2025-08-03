package com.softserve.academy.homework15;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Callable1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " | Weather running");
                    Thread.sleep(2000);
                    return "Weather loaded";
                },
                () -> {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " | Currency running");
                    Thread.sleep(1000);
                    return "Currency loaded";
                },
                () -> {
                    String name = Thread.currentThread().getName();
                    System.out.println(name + " | News running");
                    Thread.sleep(3000);
                    return "News loaded";
                }
        );
        // ✅ Запускаємо всі задачі одночасно
        List<Future<String>> results = executor.invokeAll(tasks);

        // ✅ Чекаємо і виводимо результати
        for (Future<String> future : results) {
            try {
                System.out.println(future.get()); // блокує, поки завдання не завершиться
            } catch (ExecutionException e) {
                System.out.println("Error during task execution: " + e.getMessage());
            }
        }

        executor.shutdown();
    }
}
