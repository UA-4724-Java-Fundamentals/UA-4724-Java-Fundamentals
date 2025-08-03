package com.softserve.academy.homework15;

public class Deadlock {

    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread-A acquired lockA");
                sleep(100);
                synchronized (lockB) {
                    System.out.println("Thread-A acquired lockB");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread-B acquired lockB");
                sleep(100);
                synchronized (lockA) {
                    System.out.println("Thread-B acquired lockA");
                }
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Main thread ends");
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

