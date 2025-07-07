package com.softserve.academy.homework_07.VehicleHierarchy;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
    @Override
    public void isSailing(){
        System.out.println("Liner: is sailing");
    }
}
