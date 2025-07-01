package com.softserve.academy.module01.Homework07.ProgramStructure.FlyingVehicle;


import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Plane extends FlyingVehicle {
    private int maxDistance;
    private Passengers passengers;


    public Plane(int maxDistance, Passengers passengers) {
        this.maxDistance = maxDistance;
        this.passengers = passengers;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.print("Plane flying, distance: " + getMaxDistance());

    }

    @Override
    public void land() {
        System.out.print("Plane landing");
    }

    @Override
    public String toString() {
        fly();
        return " [" + "passengers=" + passengers.getPassengers() + "]";
    }

}

