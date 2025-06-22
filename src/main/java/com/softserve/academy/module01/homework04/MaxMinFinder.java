package com.softserve.academy.module01.homework04;

import java.util.Scanner;

public class MaxMinFinder {

    enum Condition {
        MAX, MIN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        scanner.close();

        int max = findValue(number1, number2, number3, Condition.MAX);
        int min = findValue(number1, number2, number3, Condition.MIN);

        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }

    private static int findValue(int num1, int num2, int num3, Condition condition) {
        switch (condition) {
            case MAX:
                return Math.max(num1, Math.max(num2, num3));
            case MIN:
                return Math.min(num1, Math.min(num2, num3));
            default:
                throw new IllegalArgumentException("Invalid condition");
        }
    }
}