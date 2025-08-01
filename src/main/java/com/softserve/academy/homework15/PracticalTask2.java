package com.softserve.academy.homework15;

public class PracticalTask2 {
    public static void main(String[] args) throws InterruptedException {

        Thread first = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread second = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("My name is ...");
    }
}
