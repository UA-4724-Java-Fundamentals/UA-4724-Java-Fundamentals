package com.softserve.academy.homework06.birds;

public abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " cannot fly.");
    }

    @Override
    public String toString() {
        return "NonFlyingBird: " + super.toString();
    }
}
