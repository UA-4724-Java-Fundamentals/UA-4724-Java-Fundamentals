package com.softserve.academy.homework_07.VehicleHierarchy;

public abstract class GroundVehicle extends Passengers implements IVehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }


    public void drive(){
        System.out.println("GroundVehicle: is driving");
    }
}
