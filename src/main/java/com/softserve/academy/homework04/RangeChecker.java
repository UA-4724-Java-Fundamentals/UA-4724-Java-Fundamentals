package com.softserve.academy.homework04;

import java.util.Scanner;

public class RangeChecker {
    static Scanner scanner = new Scanner(System.in);
    private static final int RANGE_START = -5;
    private static final int RANGE_END = 5;

    public static void main(String[] args) {
        System.out.println("Enter 1 double number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter 2 double number");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter 3 double number");
        double num3 = Double.parseDouble(scanner.nextLine());

        String result = areNumbersInRange(num1, num2, num3) ?
                "All three numbers are within the range [-5, 5]." :
                "Not all numbers are within the range [-5, 5].";

        System.out.println(result);
    }

    public static boolean areNumbersInRange(double a, double b, double c) {
        return a >= RANGE_START && a <= RANGE_END && b >= RANGE_START && b <= RANGE_END && c >= RANGE_START && c <= RANGE_END;
    }

}
