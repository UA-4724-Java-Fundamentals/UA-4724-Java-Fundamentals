package com.softserve.academy.homework03;

import java.util.Scanner;

public class TriangleAreaCalculator {

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        double areaSquared = s * (s - a) * (s - b) * (s - c);
        if (areaSquared <= 0) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        return Math.sqrt(areaSquared);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Triangle Area Calculator ===");
        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();

        try {
            double area = calculateTriangleArea(side1, side2, side3);
            System.out.printf("The area of the triangle is %.2f%n", area);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid triangle sides entered.");
        }

        scanner.close();
    }
}