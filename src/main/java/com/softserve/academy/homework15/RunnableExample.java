package com.softserve.academy.homework15;

public class RunnableExample {
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (running) {
                System.out.println("Still running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Thread stopped.");
        });

        thread.start(); // ✅ спочатку запускаємо

        Thread.sleep(3000); // ⏳ чекаємо 3 сек

        running = false; // ❌ зупиняємо

        thread.join(); // ✅ чекаємо завершення (не обов’язково, але добре мати)
    }
}

