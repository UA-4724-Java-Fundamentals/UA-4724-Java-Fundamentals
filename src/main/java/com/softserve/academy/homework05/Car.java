package com.softserve.academy.homework05;

public class Car {
    private final String type;
    private final int year;
    private final double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void printInfo() {
        System.out.printf("Type: %s | Year: %d | Engine: %.1fL%n", type, year, engineCapacity);
    }
}
