package com.softserve.academy.homework_07.VehicleHierarchy;

public abstract class WaterVehicle extends Passengers implements IVehicle{
    public WaterVehicle(int passengers) {
        super(passengers);
    }
    public void isSailing(){
        System.out.println("WaterVehicle: is sailing");
    }
}
