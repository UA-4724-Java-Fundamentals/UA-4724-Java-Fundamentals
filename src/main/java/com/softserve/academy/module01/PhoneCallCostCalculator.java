package com.softserve.academy.module01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("The cost per minute call 1: ");
        double c1 = scanner.nextDouble();

        System.out.println("The cost per minute call 2:");
        double c2 = scanner.nextDouble();

        System.out.println("The cost per minute call 3:");
        double c3 = scanner.nextDouble();

        //
        System.out.println("The duration call 1: ");
        double t1 = scanner.nextDouble();

        System.out.println("The duration call 2: ");
        double t2 = scanner.nextDouble();

        System.out.println("The duration call 3: ");
        double t3 = scanner.nextDouble();

        //
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        //
        double totalCost = cost1 + cost2 + cost3;

        //
        System.out.println("Cost of call 1: " + cost1 + " UAH");
        System.out.println("Cost of call 2: " + cost2 + " UAH");
        System.out.println("Cost of call 3: " + cost3 + " UAH");
        System.out.println("Total cost of all calls: " + totalCost + " UAH");

        scanner.close();


    }

}
