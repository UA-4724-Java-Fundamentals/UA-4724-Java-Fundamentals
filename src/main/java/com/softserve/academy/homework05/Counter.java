package com.softserve.academy.homework05;

import java.util.Arrays;

public class Counter {
    public static void main(String[] args) {
        Boolean[] sheeps = new Boolean[]{
                true, true, true, false, true, true, true, true, true, false, true,
                false, true, false, false, true, true, true, true, true, false,
                false, true, true
        };
        System.out.println(countSheeps(sheeps));
    }

    static int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        for (Boolean item : arrayOfSheeps) {
            if (Boolean.TRUE.equals(item)) {
                result++;
            }
        }
        return result;
    }
}