package com.softserve.academy.homework2;

public class DigitSumCalculator {
    public static void main(String[] dss){
        System.out.println(DigitSumCalculator.calculateDigitSum(100));
    }


    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number/10;
            }

            return sum;
        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }

}
