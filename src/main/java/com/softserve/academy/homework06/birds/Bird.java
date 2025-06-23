package com.softserve.academy.homework06.birds;

public abstract class Bird {
    private final String feathers;
    private final boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "[ feathers " + this.getFeathers() + "]" + " [layEggs " + String.valueOf(this.isLayEggs())  + "]";
    }
}
