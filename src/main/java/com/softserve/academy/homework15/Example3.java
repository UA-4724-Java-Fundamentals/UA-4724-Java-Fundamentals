package com.softserve.academy.homework15;

import java.util.*;
import java.util.concurrent.*;

public class Example3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> "One",
                () -> "Two",
                () -> "Three"
        );

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> f : results) {
            System.out.println("Result: " + f.get());
        }

        executor.shutdown();
    }
}
