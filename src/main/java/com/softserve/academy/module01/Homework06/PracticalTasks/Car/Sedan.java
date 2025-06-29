package com.softserve.academy.module01.Homework06.PracticalTasks.Car;

public class Sedan extends Car {
    private String color;

    public Sedan(String model, int maxSpeed, int yearOfProduction, String color) {
        super(model, maxSpeed, yearOfProduction);
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(getModel() + " (Sedan) is running.");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " (Sedan) has stopped.");
    }
}
