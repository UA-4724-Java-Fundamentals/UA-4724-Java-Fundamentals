package com.softserve.academy.homework05;

import java.util.Arrays;
import java.util.Scanner;

public class RandomNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomInt();
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(countPositive(randomArray));
        System.out.println(countNegative(randomArray));
        System.out.println(compareSigns(randomArray));
    }

    static int getRandomInt() {
        return (int) (Integer.MIN_VALUE + (Math.random() * ((long) Integer.MAX_VALUE - Integer.MIN_VALUE + 1)));
    }

    static long countPositive(int[] randomArray) {
        long result = 0;
        for (int j : randomArray) {
            if (j > 0) {
                result += j;
            }
        }
        return result;
    }

    static long countNegative(int[] randomArray) {
        long result = 0;
        for (int j : randomArray) {
            if (j < 0) {
                result += j;
            }
        }
        return result;
    }

    static String compareSigns(int[] array) {
        int countSings = 0;
        for (int i : array) {
            if (i > 0) countSings++;
            if (i < 0) countSings--;
        }
        return countSings == 0 ? "There are an equal number of positive and negative values in the array" :
                countSings > 0 ? "There are more positive values in the array." :
                        "There are more negative values in the array.";
    }
}
