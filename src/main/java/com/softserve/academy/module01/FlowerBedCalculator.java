package com.softserve.academy.module01;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the flower bed: ");
        int radius = scanner.nextInt();
        //
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        //
        System.out.println("Perimeter of the flower bed: " + perimeter);
        System.out.println("Area of the flower bed: " + area);

        scanner.close();

    }
}
