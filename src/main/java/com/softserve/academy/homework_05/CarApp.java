package com.softserve.academy.homework_05;
import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Crossover", 2020, 1.6),
                new Car("Coupe", 1999, 1.9),
                new Car("SUV", 1984, 2.0),
                new Car("SUV", 2025, 2.6),

        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year of production of the car: ");

        int yearOfProduction = scanner.nextInt();


        for (Car car: cars){
            if (yearOfProduction==car.getYearOfProduction()){
            System.out.println(car);}

        }

        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));

        System.out.println("Cars sorted by year of production:");
        for (Car car: cars){
            System.out.println(car);

        };
        scanner.close();


    }
}
