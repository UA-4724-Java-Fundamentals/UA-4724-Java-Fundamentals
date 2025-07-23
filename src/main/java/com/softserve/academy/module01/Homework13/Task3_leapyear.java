package com.softserve.academy.module01.Homework13;

import java.time.Year;

public class Task3_leapyear {

    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
        System.out.println(isLeapYear(2013));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2020));
    }
}
