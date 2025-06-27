package com.softserve.academy.module01.Homework06.Task1_Birds;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Swallow());
        birds.add(new Penguin());
        birds.add(new Kiwi());
        for (Bird bird : birds) {
            bird.print();
            bird.fly();
            System.out.println();
        }
    }

}

