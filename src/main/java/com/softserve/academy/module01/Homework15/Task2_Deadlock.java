package com.softserve.academy.module01.Homework15;

public class Task2_Deadlock {
    public static void main(String[] args) throws InterruptedException {

        Thread mainthread = Thread.currentThread();
        Thread otherthread = new Thread(() -> {
            try {
                System.out.println("Other thread waiting for main thread");
                mainthread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        otherthread.start();
        System.out.println("Main thread waited");
        otherthread.join();
        System.out.println("!");
    }
}
