package com.softserve.academy.homework_15.threadChain3;

public class TwoThreadChain implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");

        }
        Thread t3 = new Thread(new ThreeThreadChain());
        t3.start();

        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
