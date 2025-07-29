package com.softserve.academy.module01.Homework15;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {


        Thread thread3 = new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        });
        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            thread3.start();
        });
        Thread thread1 = new Thread(()-> {
            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        thread1.start();
        thread1.join();
    }
}
