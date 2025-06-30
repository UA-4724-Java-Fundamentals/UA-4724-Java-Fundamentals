package com.softserve.academy.module06bird;

public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(String name) {
        super(name);
    }

    public boolean isFly() {
        return false;
    }
}
