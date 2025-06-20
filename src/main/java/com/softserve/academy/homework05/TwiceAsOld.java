package com.softserve.academy.homework05;

public class TwiceAsOld {

    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 1));
    }

    static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - 2 * sonYears);
    }
}
