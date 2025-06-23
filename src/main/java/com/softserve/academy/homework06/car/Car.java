package com.softserve.academy.homework06.car;

public abstract class Car {
    private final String model;
    private final int maxSpeed;
    private final int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void run();

    abstract void stop();

    public void printInfo() {
        System.out.println("Model: " + this.model +
                ", Max Speed: " + this.maxSpeed +
                ", Year: " + this.yearOfProduction);
    }
}
