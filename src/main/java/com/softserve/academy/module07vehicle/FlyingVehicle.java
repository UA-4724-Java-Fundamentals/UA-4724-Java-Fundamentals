package com.softserve.academy.module07vehicle;

public abstract class FlyingVehicle implements Vehicle {

    public void drive() {
        System.out.println("FlyingVehicle");
        fly();
    }

    public abstract void fly();
}
