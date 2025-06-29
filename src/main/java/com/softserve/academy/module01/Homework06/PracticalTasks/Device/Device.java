package com.softserve.academy.module01.Homework06.PracticalTasks.Device;

public abstract class Device {
    protected String brand;
    protected String model;
    protected boolean powerStatus;

    public Device(String brand, String model, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = powerStatus;
    }

    public void turnOn() {
        powerStatus = true;
        if (!Boolean.getBoolean("suppressOutput")) {
            System.out.println("The device is now ON.");
        }
    }

    public void turnOff() {
        powerStatus = false;
        if (!Boolean.getBoolean("suppressOutput")) {
            System.out.println("The device is now OFF.");
        }
    }

    public abstract void displayInfo();

}
