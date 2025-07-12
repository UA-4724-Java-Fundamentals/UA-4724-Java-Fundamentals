package com.softserve.academy.homework05;

import java.util.*;

public class CarApp {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("Toyota", 2018, 1.8),
                new Car("Honda", 2020, 2.0),
                new Car("Volkswagen", 2016, 1.6),
                new Car("Skoda", 2020, 2.0)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a model year to filter: ");
        int yearFilter = scanner.nextInt();

        System.out.println("=== Cars from year " + yearFilter + " ===");
        for (Car car : cars) {
            if (car.getYear() == yearFilter) {
                car.printInfo();
            }
        }

        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("\n=== Cars sorted by year ===");
        for (Car car : cars) {
            car.printInfo();
        }

        scanner.close();
    }
}

