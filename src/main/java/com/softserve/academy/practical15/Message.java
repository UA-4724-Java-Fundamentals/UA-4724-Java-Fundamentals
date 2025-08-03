package com.softserve.academy.practical15;

public class Message {

    public static void main(String[] args) {
        Thread helloThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello, world");
                sleep(2000);
            }
        });

        Thread peaceThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Peace in the peace");
                sleep(3000);
            }
        });

        helloThread.start();
        peaceThread.start();

        try {
            helloThread.join();
            peaceThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("My name is YourName");
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

