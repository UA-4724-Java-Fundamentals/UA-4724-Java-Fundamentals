package com.softserve.academy.module01.HW13;

public class DateValidator {

    public static boolean validateDate(String date) {
        String regex = "^(0[1-9]|1[0-2])\\.(0[1-9]|[12][0-9]|3[01])\\.\\d{2}$";

        if (!date.matches(regex)) {
            return false;
        }

        String[] parts = date.split("\\.");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        return day <= daysInMonth(month);
    }

    private static int daysInMonth(int month) {
        return switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public static void main(String[] args) {
        System.out.println(validateDate("02.29.20"));
        System.out.println(validateDate("12.15.99")); // true
    }
}

