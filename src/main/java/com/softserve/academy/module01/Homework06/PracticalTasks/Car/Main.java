package com.softserve.academy.module01.Homework06.PracticalTasks.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Truck("Ford F-150", 120, 2017, "Black");
        cars[1] = new Sedan("Toyota Camry", 150, 2021, "White");
        cars[2] = new Truck("Chevrolet Silverado", 130, 2011, "Blue");
        cars[3] = new Sedan("Audi A4", 145, 2020, "Green");
        for (Car car : cars) {
            car.print();
        }

    }
}
