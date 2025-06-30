package com.softserve.academy.module06bird;

public class AppBird {

    public static void main(String[] args) {
        Bird[] birds = { new Eagl(), new Kiwi(), new Swallow(), new Penguin() };
        //
        for (Bird current : birds) {
            System.out.println(current);
        }
    }
}
