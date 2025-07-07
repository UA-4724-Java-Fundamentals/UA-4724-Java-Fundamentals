package com.softserve.academy.homework_07.VehicleHierarchy;

public class Car extends GroundVehicle{
    private String model;


    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public void drive(){
        System.out.println("Car: is driving");
    }
}
