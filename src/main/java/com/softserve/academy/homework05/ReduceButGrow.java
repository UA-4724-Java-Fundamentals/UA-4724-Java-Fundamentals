package com.softserve.academy.homework05;

public class ReduceButGrow {
    public static void main(String[] args) {
        System.out.println(grow(new int[]{1, 2, 3}));
    }

    static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }
}
