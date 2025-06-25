package com.softserve.academy.homework05;

import java.util.Scanner;

public class MonthDaysApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();

        try {
            int days = MonthDaysCalculator.getDaysInMonth(monthNumber);
            System.out.println("Number of days in month " + monthNumber + ": " + days);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
