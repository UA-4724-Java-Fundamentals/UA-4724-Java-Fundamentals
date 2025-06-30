package com.softserve.academy.module06bird;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isFly();

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() +
                "  isFly: " + isFly() +
                '}';
    }
}
