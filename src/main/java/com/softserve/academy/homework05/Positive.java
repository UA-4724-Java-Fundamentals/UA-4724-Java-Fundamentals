package com.softserve.academy.homework05;

public class Positive {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i > 0) result += i;
        }
        return result;
    }
}
