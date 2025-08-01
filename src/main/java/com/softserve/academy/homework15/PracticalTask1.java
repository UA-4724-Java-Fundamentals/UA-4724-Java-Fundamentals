package com.softserve.academy.homework15;

public class PracticalTask1 {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        one.start();
    }
}
