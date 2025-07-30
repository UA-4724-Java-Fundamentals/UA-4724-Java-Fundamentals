package com.softserve.academy.homework13date;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AppDateHomework {
    public static void main(String[] args) {

        String dateStr = "07.30.25\s";
        System.out.println("Valid date: " +dateStr + "it is: " + isValidDate(dateStr));

        int year = 2024;
        System.out.println("Is " + year + " leap? - " + isLeapYear(year));

        LocalDate birthday = LocalDate.of(1983, 10, 14);
        printDayInfo(birthday);
    }

    public static boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy\s");
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }
    public static void printDayInfo(LocalDate date) {
        System.out.println("Original date: " + date);
        System.out.println("Day of week: " + date.getDayOfWeek());

        LocalDate plus6Months = date.plusMonths(6);
        System.out.println("After 6 months: " + plus6Months + " (" + plus6Months.getDayOfWeek() + ")");

        LocalDate plus12Months = date.plusMonths(12);
        System.out.println("After 12 months: " + plus12Months + " (" + plus12Months.getDayOfWeek() + ")");
    }

}
