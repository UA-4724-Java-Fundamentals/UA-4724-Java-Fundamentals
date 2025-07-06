package com.softserve.academy.homework08;

import java.util.Scanner;

public class DivisionTask {
    public static double div(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (double): ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number (double): ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            if (!Double.isNaN(result)) {
                System.out.println("Result of division: " + result);
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}