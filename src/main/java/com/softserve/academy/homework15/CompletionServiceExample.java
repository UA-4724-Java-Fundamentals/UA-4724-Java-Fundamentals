package com.softserve.academy.homework15;

import java.util.concurrent.*;
import java.util.List;
import java.util.Arrays;

public class CompletionServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> service = new ExecutorCompletionService<>(executor);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(2000);
                    return "Weather loaded";
                },
                () -> {
                    Thread.sleep(1000);
                    return "Currency loaded";
                },
                () -> {
                    Thread.sleep(3000);
                    return "News loaded";
                }
        );

        // Відправляємо всі задачі в сервіс
        for (Callable<String> task : tasks) {
            service.submit(task);
        }

        // Отримуємо результати у порядку їх завершення
        for (int i = 0; i < tasks.size(); i++) {
            Future<String> result = service.take(); // блокує, чекає готову задачу
            System.out.println(result.get());       // виводить одразу по завершенню
        }

        executor.shutdown();
    }
}