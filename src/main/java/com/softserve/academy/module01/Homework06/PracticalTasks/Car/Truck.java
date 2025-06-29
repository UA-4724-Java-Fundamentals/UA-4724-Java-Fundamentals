package com.softserve.academy.module01.Homework06.PracticalTasks.Car;

public class Truck extends Car {
    private String color;

    public Truck(String model, int maxSpeed, int yearOfProduction, String color) {
        super(model, maxSpeed, yearOfProduction);
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(getModel() + " (Truck) is running.");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " (Truck) has stopped.");
    }

}
