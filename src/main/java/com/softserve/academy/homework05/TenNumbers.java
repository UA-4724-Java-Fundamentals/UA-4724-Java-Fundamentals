package com.softserve.academy.homework05;

import java.util.Scanner;

public class TenNumbers {
    static Scanner scanner = new Scanner(System.in);
    private static final int HALF = 5;
    private static final int TOTAL = 10;

    public static void main(String[] args) {
        int[] numbers = new int[TOTAL];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        if (areFirstFivePositive(numbers)) {
            System.out.println("First five positive number");
            System.out.println(sumOfFirstFive(numbers));
        } else {
            System.out.println("First five not positive number. Product of five last: ");
            System.out.println(productOfLastFive(numbers));
        }


    }

    static int sumOfFirstFive(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < HALF; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int productOfLastFive(int[] numbers) {
        int product = 1;
        for (int i = HALF; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }

    static boolean areFirstFivePositive(int[] numbers) {
        int HALF = 5;
        for (int i = 0; i < HALF; i++) {
            if (numbers[i] <= 0) return false;
        }
        return true;
    }
}
