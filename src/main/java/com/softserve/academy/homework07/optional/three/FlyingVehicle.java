package com.softserve.academy.homework07.optional.three;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();
}
