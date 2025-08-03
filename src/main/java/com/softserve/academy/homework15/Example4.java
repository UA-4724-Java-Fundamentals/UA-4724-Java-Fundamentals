package com.softserve.academy.homework15;

import java.util.*;
import java.util.concurrent.*;

public class Example4 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> {
                    Thread.sleep(2000);
                    return "Slow";
                },
                () -> "Fast"
        );

        String result = executor.invokeAny(tasks); // повертає результат ПЕРШОГО успішного
        System.out.println("Fastest result: " + result);

        executor.shutdown();
    }
}
