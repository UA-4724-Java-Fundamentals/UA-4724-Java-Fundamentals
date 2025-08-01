package com.softserve.academy.homework15;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message thread2");
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Message thread3");
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread3.start();
    }
}
