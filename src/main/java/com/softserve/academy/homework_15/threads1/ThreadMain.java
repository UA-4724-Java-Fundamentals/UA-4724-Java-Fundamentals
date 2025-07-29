package com.softserve.academy.homework_15.threads1;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadFirst());
        Thread t2 = new Thread(new ThreadSecond());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Thread t3 = new Thread(new ThreadThird());
        t3.start();
    }
}
