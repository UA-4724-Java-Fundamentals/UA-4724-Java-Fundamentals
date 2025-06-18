package com.softserve.academy.homeworkL3;

import java.util.Scanner;

import static java.lang.System.in;

public class Triangle {
    public static void main(String[] args) {
         int first = getNumber("Input Side 1: ");
         int second = getNumber("Input Side 2: ");
         int third = getNumber("Input Side 3: ");

         int sum = getTotal (first, second, third);

         double average = getAverage (first,second, third) / 3.0;

        System.out.print("The sum of " + first +
                " and " + second + " and " + third + " is " + sum);

        System.out.print("The average of " + first +
                " and " + second + " and " + third + " is " + average);
    }

    static int getNumber(String promt) {
        Scanner scanner = new Scanner(in);
        System.out.println (promt);
        return Integer.parseInt(scanner.nextLine());
    }

    private static double getAverage(int first, int second, int third) {
        return getTotal(first, second, third) / 3.0;
    }

    private static int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}
