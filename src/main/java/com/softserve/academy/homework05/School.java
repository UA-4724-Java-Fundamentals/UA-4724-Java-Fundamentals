package com.softserve.academy.homework05;

import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        System.out.println(getAverage(new int[]{2, 2, 2, 2}));
    }

    static int getAverage(int[] marks) {
        int result = 0;
        for (int i : marks) {
            result += i;
        }
        return result / marks.length;
    }

}