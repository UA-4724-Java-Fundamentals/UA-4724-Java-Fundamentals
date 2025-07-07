package com.softserve.academy.module01.HW8;

import java.util.Scanner;

public class NumberReader {

    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new Exception("Введено не число");
        }

        if (number < start || number > end) {
            throw new Exception("Число не в діапазоні від " + start + " до " + end);
        }

        return number;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int lowerBound = 1;
        int upperBound = 100;

        System.out.println("Введіть 10 чисел");

        for (int i = 0; i < 10; ) {
            System.out.print("Введіть число #" + (i + 1) + ": ");
            try {
                int num = readNumber(lowerBound + 1, upperBound - 1);

                if (i > 0 && num <= numbers[i - 1]) {
                    System.out.println("Число має бути більше попереднього (" + numbers[i - 1] + ")");
                    continue;
                }

                numbers[i] = num;
                lowerBound = num;
                i++;

            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage() + ". Спробуйте ще раз.");
            }
        }

        System.out.println("Введенні числа:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}

