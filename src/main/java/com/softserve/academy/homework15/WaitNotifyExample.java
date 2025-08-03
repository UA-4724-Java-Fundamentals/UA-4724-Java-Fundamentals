package com.softserve.academy.homework15;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Waiting for signal...");
                try {
                    lock.wait(); // throws InterruptedException
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Got the signal!");
            }
        });

        Thread notifierThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // sleep before signaling
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock) {
                System.out.println("Sent signal!");
                lock.notify();
            }
        });

        waitingThread.start();
        notifierThread.start();
    }
}

