package com.softserve.academy.homework07.optional.three;

class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("Helicopter flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter landing");
    }
}
