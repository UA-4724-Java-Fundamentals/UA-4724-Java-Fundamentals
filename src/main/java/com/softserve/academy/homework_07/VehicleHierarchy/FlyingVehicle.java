package com.softserve.academy.homework_07.VehicleHierarchy;

public abstract class FlyingVehicle extends Passengers implements IVehicle{
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    public void fly(){
        System.out.println("FlyingVehicle: is flying");
    }
    public void land(){
        System.out.println("FlyingVehicle: is landing");
    }
}
