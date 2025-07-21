package com.softserve.academy.homework13;

import java.time.Year;

public class HomeWork3 {
    public static boolean isLeap(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        System.out.println(isLeap(2024)); // true
        System.out.println(isLeap(1900)); // false
        System.out.println(isLeap(2000)); // true
        System.out.println(isLeap(2023)); // false
    }
}
