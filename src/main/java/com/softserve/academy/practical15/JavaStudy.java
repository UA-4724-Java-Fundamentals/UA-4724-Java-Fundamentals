package com.softserve.academy.practical15;

public class JavaStudy {

    public static void main(String[] args) {
        Thread printer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("I study Java");
                sleep(1000);
            }
        });

        printer.start();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread interrupted");
        }
    }
}

