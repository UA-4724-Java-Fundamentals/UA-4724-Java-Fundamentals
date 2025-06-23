package com.softserve.academy.homework06.car;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan is running");
    }

    @Override
    void stop() {
        System.out.println("Sedan is stop");
    }
}
