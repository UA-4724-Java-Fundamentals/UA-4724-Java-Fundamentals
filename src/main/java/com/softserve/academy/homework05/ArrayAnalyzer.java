package com.softserve.academy.homework05;

import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int positiveCount = 0, secondPositiveIndex = -1;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }

        if (secondPositiveIndex != -1) {
            System.out.println("Index of second positive number: " + secondPositiveIndex);
        } else {
            System.out.println("Second positive number not found.");
        }

        int min = numbers[0], minIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Minimum value: " + min + ", at index: " + minIndex);

        int product = 1;
        boolean hasEven = false;
        for (int num : numbers) {
            if (num != 0 && num % 2 == 0) {
                product *= num;
                hasEven = true;
            }
        }

        if (hasEven) {
            System.out.println("Product of even numbers (excluding 0): " + product);
        } else {
            System.out.println("No non-zero even numbers entered.");
        }

        scanner.close();
    }
}
