package com.softserve.academy.homework05;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));
    }

    static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
}