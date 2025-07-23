package com.softserve.academy.homework_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class DateValidator {

    public static boolean isValidDate(String dateString) {
        if (dateString == null) {
            return false;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.uu")
                .withResolverStyle(ResolverStyle.STRICT);

        try {
            LocalDate.parse(dateString, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void printDateResult(String dateString) {
        String result = isValidDate(dateString) ? "valid" : "not valid";
        System.out.println(dateString + " format is " + result + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in format MM.dd.yy: ");
        String input = scanner.nextLine().trim();
        printDateResult(input);
        scanner.close();
    }
}


