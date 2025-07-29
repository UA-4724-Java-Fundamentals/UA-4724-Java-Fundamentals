package com.softserve.academy.module01.Homework15.Task1;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();



    }
}
