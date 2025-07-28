package com.softserve.academy.module15buket;

public class Basket {
    private String fruit;
    private volatile boolean fruitIsAvailable = false;

    public synchronized String pollFruit() { // Basket.class
        while (!fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get: " + fruit);
        fruitIsAvailable = false;
        notify();
        return fruit;
    }

    public synchronized void putFruit(String fruit) {
        while (fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.fruit = fruit;
        fruitIsAvailable = true;
        System.out.println("Put: " + fruit);
        notify();
    }
}
                