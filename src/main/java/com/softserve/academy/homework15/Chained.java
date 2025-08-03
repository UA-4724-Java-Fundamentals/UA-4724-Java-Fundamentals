package com.softserve.academy.homework15;

public class Chained {

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread number two");
                    sleep(100);
                }

                Thread three = new Thread(() -> {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Thread number three");
                        sleep(100);
                    }
                });

                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        one.start();
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

