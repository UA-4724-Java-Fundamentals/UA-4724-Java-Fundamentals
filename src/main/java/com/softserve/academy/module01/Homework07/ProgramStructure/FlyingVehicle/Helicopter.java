package com.softserve.academy.module01.Homework07.ProgramStructure.FlyingVehicle;
import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;
    private Passengers passengers;

    public Helicopter(int weight, int maxHeight, Passengers passengers) {
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.passengers = passengers;
    }


    @Override
    public void fly() {
        System.out.print("Helicopter flying, maxHeight: " + maxHeight + " weight " + weight);

    }

    @Override
    public void land() {
        System.out.println("Helicopter landing");

    }

    @Override
    public String toString() {
        fly();
        return " [" + "passengers=" + passengers.getPassengers() + "]";
    }

}
