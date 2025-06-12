package com.softserve.academy.homework_03;

public class TemperatureConverter {
    public static void main(String[] args) {
        double tempFahrenheit = 200;
        double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9.0);
        System.out.println("Temperature in Celsius: " + tempCelsius);
    }
}
