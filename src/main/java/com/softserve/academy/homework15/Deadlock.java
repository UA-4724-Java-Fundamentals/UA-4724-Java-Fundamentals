package com.softserve.academy.homework15;

public class Deadlock {
    private final static Object LOCK1 = new Object();
    private final static Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (LOCK1) {
                System.out.println("Thread t1: holding lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (LOCK2) {

                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (LOCK2) {
                System.out.println("Thread t2: holding lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (LOCK1) {

                }
            }
        });
        t1.start();
        t2.start();
    }
}
