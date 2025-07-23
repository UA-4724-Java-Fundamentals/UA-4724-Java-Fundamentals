package com.softserve.academy.module01.Homework13;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Task2_date {
    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM.dd.yy");

    public static boolean testdate (String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, dateFormat);
            return true;

        } catch (DateTimeParseException e){
            return false;
        }
    }

    public static void main(String[] args) {
        String[] testDates = {
                "01.15.23",
                "02.29.20",
                "04.31.99",
                "13.01.21",
                "12.00.20",
                "12.15.2a"
        };

        for(String testDate : testDates) {
            if(testdate(testDate)){
                System.out.println(testDate);
            }
        }
    }
}
