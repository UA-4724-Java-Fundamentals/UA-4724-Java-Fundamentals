package com.softserve.academy.module09inner;

public class AppCar {

    public static void main(String[] args) {
        Car car = Car.builder()
                .setHonda()
                .setRed()
                .setPetrol()
                .setManual()
                .setLed()
                .build();
        System.out.println(car);
    }
}
