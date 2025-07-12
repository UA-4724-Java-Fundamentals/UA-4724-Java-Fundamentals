package com.softserve.academy.homework05;

import java.util.Scanner;

public class SumOrProductCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum of first five positive numbers: " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("Product of last five numbers: " + product);
        }

        scanner.close();
    }
}

