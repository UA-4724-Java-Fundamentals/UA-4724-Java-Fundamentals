package com.softserve.academy.module15buket;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        new Producer(basket);
        new Consumer(basket);
    }
}   