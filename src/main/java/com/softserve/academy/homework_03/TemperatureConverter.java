package com.softserve.academy.homework_03;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit){
        double tempFahrenheit = 200;
        double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9.0);
        return tempCelsius;
    }
}
