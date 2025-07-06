package com.softserve.academy.homework6abstract;

public abstract class Bird {
    private String name;
    private boolean feathers;
    private boolean layEggs;

    public String getName() {
        return name;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public Bird(String name, boolean feathers, boolean layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
