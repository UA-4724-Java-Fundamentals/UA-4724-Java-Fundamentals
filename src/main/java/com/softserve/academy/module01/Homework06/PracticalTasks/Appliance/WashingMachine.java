package com.softserve.academy.module01.Homework06.PracticalTasks.Appliance;

public class WashingMachine extends Appliance {
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }


    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Washing Machine - Brand: " + getBrand() + ", Model: " + getModel() + ", Load Capacity: " + getLoadCapacity() + " kg");
    }
}
