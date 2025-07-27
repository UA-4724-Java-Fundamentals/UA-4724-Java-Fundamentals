package com.softserve.academy.module01.HW13;

import java.time.Year;
import java.util.function.Predicate;

public class LeapYearChecker {

    static Predicate<Integer> isLeapYear = Year::isLeap;

    public static void main(String[] args) {
        System.out.println(isLeapYear.test(2020)); // true
        System.out.println(isLeapYear.test(1900)); // false
        System.out.println(isLeapYear.test(2000)); // true
        System.out.println(isLeapYear.test(2023)); // false
    }
}

