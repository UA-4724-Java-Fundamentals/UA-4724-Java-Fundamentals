package com.softserve.academy.homework06.birds;

public class Swallow extends FlyingBird {
    public Swallow() {
        super("Small sleek feathers", true);
    }

    @Override
    public String toString() {
        return "Swallow -> " + super.toString();
    }
}
