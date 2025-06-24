package com.softserve.academy.homework06.practicaltask;

public class WashingMachine extends Appliance {

    protected int loadCapacity;

    public WashingMachine(String brand, String model, int loadCapacity) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Washing Machine - Brand: " + this.brand + ", Model: " +
                this.model + ", Load Capacity: " + this.loadCapacity + " kg");
    }
}
