package com.softserve.academy.homeworkL4;

import java.util.Scanner;

import static java.lang.System.in;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        System.out.println("First number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Third number: ");
        double num3 = scanner.nextDouble();

        if (num1 >= -5 && num1 <= 5 &&
                num2 >= -5 && num2 <= 5 &&
                num3 >= -5 && num3 <= 5) {
            System.out.println("Усі числа належать діапазону [-5, 5]");
        } else {
            System.out.println("Не всі числа належать діапазону [-5, 5]");
        }

    }
}
