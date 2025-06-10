package com.softserve.academy.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBedCalculator {
    public static void main(String[] args) throws IOException {
        int radius;
        double perimeter;
        double area;

        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        radius = Integer.parseInt(r.readLine());

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("Perimeter :" + perimeter);
        System.out.println("Area " + area);
    }
}