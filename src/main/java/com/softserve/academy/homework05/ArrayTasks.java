package com.softserve.academy.homework05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // part 1
        String[] srtArray = new String[]{"Max", "Alex", "Valeria", "Patrick", "Petr"};
        System.out.println(Arrays.toString(srtArray));
        // part 2
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        Arrays.sort(srtArray);
        System.out.println(getAverageFromArray(intArray));

        // part 3
        checkValueInArrays(srtArray, intArray);
    }

    public static int getAverageFromArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void checkValueInArrays(String[] strArray, int[] intArray) {
        System.out.print("Please enter a value for search: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered number: " + number);
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == number) {
                    System.out.println("Element in array - index: " + i + " , value: " + number);
                }
            }
        } else {
            String string = scanner.next();
            System.out.println("You entered string: " + string);
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].equalsIgnoreCase(string)) {
                    System.out.println("Element  array - index: " + i + " , value: " + string.toLowerCase());
                }
            }
        }
    }
}
