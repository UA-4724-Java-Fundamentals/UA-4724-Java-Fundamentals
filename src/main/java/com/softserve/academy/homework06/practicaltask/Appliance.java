package com.softserve.academy.homework06.practicaltask;

abstract class Appliance {
    protected String brand;
    protected String model;

    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    abstract public void displayInfo();
}
