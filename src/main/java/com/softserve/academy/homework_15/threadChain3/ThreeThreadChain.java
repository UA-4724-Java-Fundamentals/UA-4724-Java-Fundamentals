package com.softserve.academy.homework_15.threadChain3;

public class ThreeThreadChain implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}
