package com.softserve.academy.module01.HW3;

import java.util.Scanner;

import static java.lang.System.in;

public class TriangleCalculator {
    public static double calculateArea(double a, double b, double c) {
        if (a + b <= c || a + c <= b || c + b <= a){
            System.out.println("Error");
            return -1;
        }

        double s = (a + b + c) / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.print("Enter number 1: ");
        double a = scan.nextDouble();

        System.out.print("Enter number 2: ");
        double b = scan.nextDouble();

        System.out.print("Enter number 3: ");
        double c = scan.nextDouble();

        double area = calculateArea(a, b, c);

        if (area != -1){
            System.out.printf("Area of triangle is: "+ area);
        }
    }
}


