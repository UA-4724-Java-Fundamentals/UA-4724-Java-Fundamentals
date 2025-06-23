package com.softserve.academy.homework06.birds;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Brown fluffy feathers", true);
    }

    @Override
    public String toString() {
        return "Kiwi -> " + super.toString();
    }
}
