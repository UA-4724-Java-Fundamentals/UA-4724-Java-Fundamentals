package com.softserve.academy.module01.Homework06.PracticalTasks.Car;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public abstract void run();

    public abstract void stop();

    public void print() {
        System.out.println("Model: " + model + " maxSpeed: " + maxSpeed + " yearOfProduction: " + yearOfProduction);
    }

}