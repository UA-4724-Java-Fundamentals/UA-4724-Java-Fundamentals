package com.softserve.academy.homework_05;

/**
 * This class provides functionality to calculate
 * the number of days in a month based on its number (1-12).
 */
public class MonthDaysCalculator {

    // Static final array representing the number of days in each month (January to December)
    private static final int[] DAYS_IN_MONTHS = {
            31, // January
            28, // February (without leap year support)
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
    };

    public int getDaysInMonth(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            return DAYS_IN_MONTHS[monthNumber - 1];
        } else {
            return -1; // Invalid month number
        }
    }
}
