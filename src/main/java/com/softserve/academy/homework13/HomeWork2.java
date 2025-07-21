package com.softserve.academy.homework13;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class HomeWork2 {

    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.uu")
                .withResolverStyle(ResolverStyle.STRICT);

        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("02.29.24")); // true (2024 is leap year)
        System.out.println(isValidDate("13.01.25")); // false (month 13 invalid)
        System.out.println(isValidDate("11.31.22")); // false (November has 30 days)
    }
}

