package com.softserve.academy.module01.HW15;

public class ThreadExample {
    public static void main(String[] args) {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread two = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two");
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Thread three = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number three");
                                    try {
                                        Thread.sleep(100);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                        three.start();
                        try {
                            three.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                two.start();
                try {
                    two.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        one.start();

        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
