package com.softserve.academy.homework06;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = {
            new Sedan("Toyota Camry", 210, 2020),
            new Truck("Volvo FH", 180, 2018),
            new Sedan("Honda Accord", 220, 2021),
            new Truck("MAN TGS", 170, 2017)
        };

        for (Car car : cars) {
            car.printInfo();
            car.run();
            car.stop();
            System.out.println("----------------------");
        }
    }
}
