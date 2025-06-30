package com.softserve.academy.module07vehicle;

public abstract class WaterVehicle implements Vehicle {

    public void drive() {
        System.out.println("WaterVehicle");
        isSailing();
    }

    public abstract void isSailing();
}
