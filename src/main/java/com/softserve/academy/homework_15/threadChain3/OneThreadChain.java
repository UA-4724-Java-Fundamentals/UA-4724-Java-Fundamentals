package com.softserve.academy.homework_15.threadChain3;

public class OneThreadChain implements Runnable {
    @Override
    public void run() {
        Thread t2 = new Thread(new TwoThreadChain());
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
