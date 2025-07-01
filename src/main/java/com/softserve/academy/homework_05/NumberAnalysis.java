package com.softserve.academy.homework_05;

public class NumberAnalysis {
    private int[] numbers;

    public NumberAnalysis(int[] numbers) {
        this.numbers = numbers;
    }


    public int findSecondPositive() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] findMinAndIndex() {
        if (numbers == null || numbers.length == 0) {
            // Handle case for empty or null array
            return new int[] {Integer.MIN_VALUE, -1};
        }
        int min = numbers[0];
        int index = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                index = i;
            }
        }
        return new int[] {min, index};
    }

    public int calculateEvenProduct() {
        int product = 1;
        boolean hasEven = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                product *= numbers[i];
                hasEven = true;
            }
        }
        return hasEven ? product : 0;
    }
}