package com.softserve.academy.module01.Homework08;

import java.util.Scanner;

public class DivExceptions {

    public static double div(double a, double b) {
        double result = a % b;
        if (Double.isNaN(result)) {
            throw new ArithmeticException("Residue from division by zero is not determined (NaN)");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Enter 2 double values: ");
        try {
            a = sc.nextDouble();
            b = sc.nextDouble();
            double result = div(a, b);
            System.out.println("Residue: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

}
