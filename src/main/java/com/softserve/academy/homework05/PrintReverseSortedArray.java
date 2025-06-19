package com.softserve.academy.homework05;

import java.util.Arrays;

public class PrintReverseSortedArray {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        printReverseSortedArray(array);
    }

    private static void printReverseSortedArray(int[] array) {
        int[] temp = array.clone();
        int[] result = new int[temp.length];
        Arrays.sort(temp);
        for (int i = temp.length - 1, j = 0; i > -1; i--, j++) {
            result[j] = temp[i];
        }
        System.out.println(Arrays.toString(result));
    }
}