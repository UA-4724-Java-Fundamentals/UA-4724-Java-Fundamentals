package com.softserve.academy.homework_01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the cost per minute of each call
        // The first call
        System.out.println("Enter the cost per minute for the first call: ");
        double c1 = sc.nextDouble();

        System.out.println("Enter the duration for the first call: ");
        double t1 = sc.nextDouble();

        // The second call
        System.out.println("Enter the cost per minute for the second call: ");
        double c2 = sc.nextDouble();

        System.out.println("Enter the duration for the second call: ");
        double t2 = sc.nextDouble();

        // The third call
        System.out.println("Enter the cost per minute for the third call: ");
        double c3 = sc.nextDouble();

        System.out.println("Enter duration for the third call: ");
        double t3 = sc.nextDouble();

        // Calculate the cost of each call
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        // Calculate the total cost of all calls
        double totalCost = cost1 + cost2 + cost3;

        // Output the cost of each call and the total cost
        System.out.println("Cost of the first call is " + cost1);
        System.out.println("Cost of the second call is " + cost2);
        System.out.println("Cost of the third call is " + cost3);
        System.out.println("The total cost is " + totalCost);

        // Close the Scanner
        sc.close();

    }
}
