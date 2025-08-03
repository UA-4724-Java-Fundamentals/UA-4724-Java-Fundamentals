package com.softserve.academy.homework15;

public class Printer {
    public synchronized void printMessage(String message) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Synchronized message: " + message);
            try {
                Thread.sleep(1000); // ⏳ затримка між виводами
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer(); // ✅ один спільний об’єкт

        Thread thread1 = new Thread(() -> printer.printMessage("Hello"));

        Thread thread2 = new Thread(() -> printer.printMessage("Java"));

        thread1.start();
        thread2.start();
    }
}

