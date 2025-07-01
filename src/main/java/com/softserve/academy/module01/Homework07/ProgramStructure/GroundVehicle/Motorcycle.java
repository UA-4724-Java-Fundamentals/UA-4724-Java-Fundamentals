package com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;
    private Passengers passengers;

    public Motorcycle(int maxSpeed, Passengers passengers) {
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle drive with max speed: " + getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Motorcycle [maxSpeed=" + maxSpeed + ", passengers=" + passengers.getPassengers() + "]";
    }

}
