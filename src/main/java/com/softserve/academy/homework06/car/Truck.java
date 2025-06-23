package com.softserve.academy.homework06.car;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck is running");
    }

    @Override
    void stop() {
        System.out.println("Truck stopped");
    }
}
