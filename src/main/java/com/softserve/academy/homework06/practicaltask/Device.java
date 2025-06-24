package com.softserve.academy.homework06.practicaltask;

abstract class Device {
    protected String brand;
    protected String model;
    protected boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    public void turnOn() {
        this.powerStatus = true;
        System.out.println("The device is now ON.");
    }

    public void turnOff() {
        this.powerStatus = false;
        System.out.println("The device is now OFF.");
    }

    public abstract void displayInfo();
}
