package com.softserve.academy.module01.Homework15.Task1;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread #" + i + ": "+Thread.currentThread().getName());
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
