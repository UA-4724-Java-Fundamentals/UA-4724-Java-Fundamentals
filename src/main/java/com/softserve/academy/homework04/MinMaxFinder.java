package com.softserve.academy.homework04;

import java.util.Scanner;

public class MinMaxFinder {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 1 int number");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter 2 int number");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter 3 int number");
        int num3 = Integer.parseInt(scanner.nextLine());


        System.out.println("The minimum value is: " + Math.min(num1, Math.min(num2, num3)));
        System.out.println("The maximum value is: " + Math.max(num1, Math.max(num2, num3)));
    }
}
