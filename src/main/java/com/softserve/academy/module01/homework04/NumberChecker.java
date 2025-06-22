package com.softserve.academy.module01.homework04;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        scanner.close();

        if (isInRange(number1) && isInRange(number2) && isInRange(number3)) {
            System.out.println("All three numbers belong to the range [-5, 5].");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5].");
        }
    }

    private static boolean isInRange(double number) {
        return number >= -5 && number <= 5;
    }
}