package com.softserve.academy.homework06.birds;

public class Eagle extends FlyingBird {
    public Eagle() {
        super("Brown feathers", true);
    }

    @Override
    public String toString() {
        return "Eagle -> " + super.toString();
    }
}
