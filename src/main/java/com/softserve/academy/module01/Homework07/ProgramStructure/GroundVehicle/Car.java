package com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Car extends GroundVehicle {
    private String model;
    private Passengers passengers;

    public Car(String model, Passengers passengers) {
        this.model = model;
        this.passengers = passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving " + model + "with " + passengers + " passengers");
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", passengers=" + passengers.getPassengers() + "]";
    }

}
