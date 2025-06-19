package com.softserve.academy.homework05;

public class ArraySum {

    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};
        System.out.println(calculateSum(array));
    }

    static int calculateSum(int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }
}
