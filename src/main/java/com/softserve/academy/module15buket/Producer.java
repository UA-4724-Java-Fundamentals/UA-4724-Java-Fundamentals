package com.softserve.academy.module15buket;

public class Producer implements Runnable {
    private Basket basket;
    private String[] fruits = {"Apple", "Orange", "Lemon", "Cherry", "Pineapple"};

    public Producer(Basket basket) {
        this.basket = basket;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            basket.putFruit(fruits[i]);
        }
    }
}  