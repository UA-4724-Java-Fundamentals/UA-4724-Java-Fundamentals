package com.softserve.academy.homework06.birds;

public abstract class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }

    @Override
    public String toString() {
        return "FlyingBird: " + super.toString();
    }
}
