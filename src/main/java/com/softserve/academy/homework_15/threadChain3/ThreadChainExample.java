package com.softserve.academy.homework_15.threadChain3;

public class ThreadChainExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new OneThreadChain());
        t1.start();
        t1.join();

    }
}
