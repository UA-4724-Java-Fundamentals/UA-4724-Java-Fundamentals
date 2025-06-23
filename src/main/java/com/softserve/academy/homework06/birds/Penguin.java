package com.softserve.academy.homework06.birds;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Black and white feathers", true);
    }

    @Override
    public String toString() {
        return "Penguin -> " + super.toString();
    }
}
