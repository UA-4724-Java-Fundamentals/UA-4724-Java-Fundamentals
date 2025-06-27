package com.softserve.academy.module01.Homework06.Task1_Birds;

public class FlyingBird extends Bird {

    public FlyingBird(String name, String feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird");
    }


}
