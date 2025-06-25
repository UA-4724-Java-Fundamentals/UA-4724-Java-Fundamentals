package com.softserve.academy.homework05;

public class MonthDaysCalculator {
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public static int getDaysInMonth(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            return DAYS_IN_MONTH[monthNumber - 1];
        } else {
            throw new IllegalArgumentException("Invalid month number: " + monthNumber);
        }
    }
}
