package com.softserve.academy.homework04;

public class AgeDiff {
    public static void main(String[] args) {
        System.out.println(calculateAge(2012, 2016));
        System.out.println(calculateAge(2000, 1990));
        System.out.println(calculateAge(3400, 3400));
        System.out.println(calculateAge(2011, 2012));
        System.out.println(calculateAge(2000, 1999));
    }

    public static String calculateAge(int birth, int yearTo) {
        int diff = yearTo - birth;

        if (diff == 0) {
            return "You were born this very year!";
        }

        String yearWord = Math.abs(diff) == 1 ? "year" : "years";

        if (diff > 0) {
            return "You are " + diff + " " + yearWord + " old.";
        } else {
            return "You will be born in " + (-diff) + " " + yearWord + ".";
        }
    }
}
