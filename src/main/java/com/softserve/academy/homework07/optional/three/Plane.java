package com.softserve.academy.homework07.optional.three;

class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane() {
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        System.out.println("Plane flying");
    }

    @Override
    void land() {
        System.out.println("Plane landing");
    }
}
