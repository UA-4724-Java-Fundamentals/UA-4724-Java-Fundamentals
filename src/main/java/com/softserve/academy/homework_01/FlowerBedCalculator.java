package com.softserve.academy.homework_01;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc  = new Scanner(System.in);

        // Prompt the user to enter the radius of the flower bed
        System.out.println("Enter the radius of the flower bed: ");
        int radius = sc.nextInt();

        // Calculate the perimeter and area of the circle
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Output the calculated perimeter and area to the console
        System.out.println("The perimeter of the flower bed is "+ perimeter);
        System.out.println("The area of the flower bed is "+ area);

        // Close the scanner
        sc.close();

    }
}
