package com.softserve.academy.homework13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class FunctionalInterfaceHomework {

    /**
     * Encrypts a string using Caesar cipher by shifting letters by n positions.
     * @param input the original string
     * @param shift number of positions to shift
     * @return the encrypted string
     */
    public static String encrypt(String input, int shift) {
        return shiftString(input, shift);
    }

    /**
     * Decrypts a Caesar cipher by shifting letters back by n positions.
     * @param input the encrypted string
     * @param shift number of positions to shift back
     * @return the decrypted string
     */
    public static String decrypt(String input, int shift) {
        return shiftString(input, -shift);
    }

    private static String shiftString(String input, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) ((ch - base + shift + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    /**
     * Validates if a given string is a valid date in format "MM.dd.yy".
     * @param dateStr the string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy", Locale.ENGLISH);
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    /**
     * Checks whether a given year is a leap year.
     * @param year the year to check
     * @return true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    /**
     * Prints the day of the week for the given date, and for 6 and 12 months after it.
     * @param date the base LocalDate
     */
    public static void printDateDetails(LocalDate date) {
        DayOfWeek original = date.getDayOfWeek();
        DayOfWeek plus6Months = date.plusMonths(6).getDayOfWeek();
        DayOfWeek plus12Months = date.plusMonths(12).getDayOfWeek();

        System.out.println("Original date: " + date + " - " + original);
        System.out.println("After 6 months: " + date.plusMonths(6) + " - " + plus6Months);
        System.out.println("After 12 months: " + date.plusMonths(12) + " - " + plus12Months);
    }

    public static void main(String[] args) {
        // Task 1: Encryption / Decryption
        String original = "Hello, World!";
        int shift = 3;
        String encrypted = encrypt(original, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original:  " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);

        // Task 2: Date Validation
        String dateStr = "07.27.25";
        System.out.println("Is valid date? " + isValidDate(dateStr));

        // Task 3: Leap Year
        int year = 2024;
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));

        // Task 4: LocalDate and Day of Week
        LocalDate birthday = LocalDate.of(1998, 7, 27); // Change to your birthday
        printDateDetails(birthday);
    }
}
