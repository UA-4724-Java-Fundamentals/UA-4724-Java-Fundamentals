package com.softserve.academy.homework4;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform another operation? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program stopped.");
    }
}
