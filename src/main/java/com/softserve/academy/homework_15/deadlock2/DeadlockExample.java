package com.softserve.academy.homework_15.deadlock2;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        final Object lock1 = new Object();
        final Object lock2 = new Object();


        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for lock2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: holding lock1 and lock2...");
                }
            }
        });


        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: holding lock2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: waiting lock1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: holding lock2 and lock1");
                }
            }
        });


        t1.start();
        t2.start();


        t1.join();
        t2.join();

        // won't be print
        System.out.println("Цей рядок не з'явиться, бо потоки заблоковані (deadlock)");
    }
}
