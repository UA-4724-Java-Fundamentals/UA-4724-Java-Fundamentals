package com.softserve.academy.homework_15.threads1;

public class ThreadFirst implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Message from Thread 1");

        }
    }

}