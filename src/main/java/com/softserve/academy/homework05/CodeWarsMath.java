package com.softserve.academy.homework05;

public class CodeWarsMath {
    public static void main(String[] args) {
        System.out.println(nearestSq(10));
    }

    static int nearestSq(final int n) {
        int sqrt = (int) Math.sqrt(n);
        int lowerSquare = sqrt * sqrt;
        int upperSquare = (sqrt + 1) * (sqrt + 1);

        return (n - lowerSquare) <= (upperSquare - n) ? lowerSquare : upperSquare;
    }
}
