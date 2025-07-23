package com.softserve.academy.module01.Homework13;

import java.time.LocalDate;

public class Task4_birthday {
    public static void printday(LocalDate birthday) {
        System.out.println("Day of week: " +birthday.getDayOfWeek().toString());
        birthday = birthday.plusMonths(6);
        System.out.println("After 6month: " + birthday.getDayOfWeek().toString());
        birthday = birthday.plusMonths(6);
        System.out.println("After 12month: " + birthday.getDayOfWeek().toString());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 5, 21);
        printday(birthday);
    }
}
