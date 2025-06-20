package com.softserve.academy.homework05;

import java.util.Arrays;

public class Dinglemouse {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }

    static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        for (int i = 1; i < humanYears + 1; i++) {
            if (i == 1) {
                catYears += 15;
                dogYears += 15;
                continue;
            }
            if (i == 2) {
                catYears += 9;
                dogYears += 9;
                continue;
            }
            catYears += 4;
            dogYears += 5;
        }

        return new int[]{humanYears, catYears, dogYears};
    }

}