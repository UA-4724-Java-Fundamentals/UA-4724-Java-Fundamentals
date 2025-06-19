package com.softserve.academy.homework04;

public class DivisibleNb {
    public static void main(String[] args) {
        System.out.println(isDivisible(12,4,3));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
