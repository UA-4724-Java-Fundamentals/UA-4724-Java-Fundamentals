package com.softserve.academy.homework6abstract;

public class FlyingBird extends Bird{

    public FlyingBird(String name, boolean feathers, boolean layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Flying bird is flying!");
    }

}
