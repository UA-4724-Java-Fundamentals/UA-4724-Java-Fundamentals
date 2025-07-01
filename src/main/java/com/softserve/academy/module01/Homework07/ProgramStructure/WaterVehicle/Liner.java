package com.softserve.academy.module01.Homework07.ProgramStructure.WaterVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Liner extends WaterVehicle {
    private int floors;
    private Passengers passengers;

    public Liner(int floors, Passengers passengers) {
        this.floors = floors;
        this.passengers = passengers;
    }


    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Non-sailing transport");
    }

    @Override
    public String toString() {
        isSailing();
        return "Liner [floors=" + floors + ", passengers=" + passengers.getPassengers() + "]";
    }


}
