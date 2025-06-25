package com.softserve.academy.homework05;

import java.util.Scanner;

public class FiveInteger {
    static Scanner scanner = new Scanner(System.in);
    private static final int TOTAL = 5;

    public static void main(String[] args) {
        int[] numbers = new int[TOTAL];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        positionSecondPositive(numbers);
        positionMinimumNumbers(numbers);
    }

    static void positionSecondPositive(int[] numbers) {
        int countPositiveIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                countPositiveIndex++;
            }
            if (numbers[i] > 0 && countPositiveIndex == 2) {
                System.out.println("Positive number value: " + numbers[i] + " index: " + i);
                break;
            }
        }
    }

    static void positionMinimumNumbers(int[] numbers) {
        int minimumNumber = numbers[0];
        int minimumIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minimumNumber) {
                minimumNumber = numbers[i];
                minimumIndex = i;
            }
        }
        System.out.println("Minimum number: " + minimumNumber + " index: " + minimumIndex);
    }

    static void productNumbersWithoutZero(int[] numbers) {
        int sum = 1;
        for (int number : numbers) {
            if (number == 0) continue;
            sum *= number;
        }
        System.out.println("Product numbers without zero: " + sum);
    }
}
