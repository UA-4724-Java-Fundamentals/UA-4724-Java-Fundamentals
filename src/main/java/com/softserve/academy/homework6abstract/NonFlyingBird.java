package com.softserve.academy.homework6abstract;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String name, boolean feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Bird is not flying!");
    }
}
