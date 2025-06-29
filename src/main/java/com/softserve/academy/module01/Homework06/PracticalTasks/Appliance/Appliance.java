package com.softserve.academy.module01.Homework06.PracticalTasks.Appliance;

public abstract class Appliance {

    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void displayInfo();

}
