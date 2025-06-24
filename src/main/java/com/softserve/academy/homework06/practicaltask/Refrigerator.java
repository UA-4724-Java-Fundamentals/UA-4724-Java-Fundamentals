package com.softserve.academy.homework06.practicaltask;

public class Refrigerator extends Appliance {
    protected int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator - Brand: " + this.brand + ", Model: " +
                this.model + ", Capacity: " + this.capacity + " liters");
    }
}
