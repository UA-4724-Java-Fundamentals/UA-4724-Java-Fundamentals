package com.softserve.academy.module01.Homework06.PracticalTasks.Appliance;

public class Refrigerator extends Appliance {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator - Brand: " + getBrand() + ", Model: " + getModel() + ", Capacity: " + getCapacity() + " liters");
    }


}
