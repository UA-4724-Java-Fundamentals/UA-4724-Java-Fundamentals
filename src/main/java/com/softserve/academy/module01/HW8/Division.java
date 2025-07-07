package com.softserve.academy.module01.HW8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль забороненно!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Результат ділення: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Помилка: число не введено.");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена.");
        }
    }
}

