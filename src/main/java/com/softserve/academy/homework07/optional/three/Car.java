package com.softserve.academy.homework07.optional.three;

public class Car extends GroundVehicle {
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("Car driving");
    }
}
