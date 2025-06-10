package com.softserve.academy.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius = ");
        int radius = sc.nextInt();
        System.out.println("Area = " + Math.PI * radius * radius);
        System.out.println("Perimeter = " + 2 * Math.PI * radius);
    }
}
