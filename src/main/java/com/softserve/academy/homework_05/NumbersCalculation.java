package com.softserve.academy.homework_05;


public class NumbersCalculation {

    public boolean isFirstFivePositive(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                return false;
            }
        }
        return true;
    }

    public int process(int[] numbers) {
        if (isFirstFivePositive(numbers)) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            return sum;
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            return product;
        }
    }
}
