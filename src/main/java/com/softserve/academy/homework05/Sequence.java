package com.softserve.academy.homework05;

import java.util.Arrays;

public class Sequence {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = array.length, j = 0; i > 0; i--, j++) {
            array[j] = i;
        }
        return array;
    }

}
