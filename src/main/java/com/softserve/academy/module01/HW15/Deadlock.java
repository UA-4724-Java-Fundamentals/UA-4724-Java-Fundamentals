package com.softserve.academy.module01.HW15;

public class Deadlock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread finished.");
    }
}
