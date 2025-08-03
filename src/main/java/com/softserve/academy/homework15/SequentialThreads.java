package com.softserve.academy.homework15;

public class SequentialThreads {

    public static void main(String[] args) throws InterruptedException {
        Thread worker1 = new Thread(() -> printMessages("Worker-1"));
        Thread worker2 = new Thread(() -> printMessages("Worker-2"));

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        Thread worker3 = new Thread(() -> printMessages("Worker-3"));
        worker3.start();
    }

    private static void printMessages(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%s: Message %d%n", threadName, i);
            try {
                Thread.sleep(100); // simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println(threadName + " was interrupted.");
            }
        }
    }
}

