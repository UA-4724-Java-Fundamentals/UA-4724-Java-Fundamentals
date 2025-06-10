package com.softserve.academy.homework01;

public class GrassHopper {

    public static void main(String[] args) {
        String result = GrassHopper.weatherInfo(23);
        System.out.printf(result);
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");

    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) / 1.8;
    }
}
