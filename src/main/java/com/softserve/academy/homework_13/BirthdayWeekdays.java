package com.softserve.academy.homework_13;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class BirthdayWeekdays {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2000, 01, 01);

        printWeekdays(birthday);
    }


    public static void printWeekdays(LocalDate date) {

        DayOfWeek originalDay = date.getDayOfWeek();
        System.out.println("Original date: " + date + " — Day of the week: " + originalDay);

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayAfterSixMonths = sixMonthsLater.getDayOfWeek();
        System.out.println("After 6 months: " + sixMonthsLater + " — Day of the week: " + dayAfterSixMonths);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayAfterTwelveMonths = twelveMonthsLater.getDayOfWeek();
        System.out.println("After 12 months: " + twelveMonthsLater + " — Day of the week: " + dayAfterTwelveMonths);
    }
}
