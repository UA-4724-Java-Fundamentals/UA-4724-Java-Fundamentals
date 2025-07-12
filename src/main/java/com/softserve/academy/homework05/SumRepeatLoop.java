package com.softserve.academy.homework05;

import java.util.Scanner;

public class SumRepeatLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Sum is: " + (a + b));

            System.out.print("Do you want to repeat? (yes/no): ");
            scanner.nextLine();
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes") || choice.equals("y"));

        scanner.close();
    }
}
