package com.softserve.academy.module06bird;

public abstract class FlyingBird extends Bird {

    public FlyingBird(String name) {
        super(name);
    }

    public boolean isFly() {
        return true;
    }
}
