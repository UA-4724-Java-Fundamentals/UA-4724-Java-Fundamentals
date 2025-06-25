package com.softserve.academy.module02;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("celsius" + celsius);
        System.out.println((11.0 / 7));
    }

}