package com.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHomework {

    // Один Scanner на весь клас
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Метод виконує ділення двох чисел і кидає
     * ArithmeticException, якщо дільник = 0.
     */
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Читає з консолі число, перетворює в int і перевіряє,
     * що start <= number <= end.
     * @throws NumberFormatException якщо введено не ціле число
     * @throws IllegalArgumentException якщо поза діапазоном
     */
    public static int readNumber(int start, int end) {
        String line = sc.nextLine().trim();
        int number;
        try {
            number = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid integer: \"" + line + "\"");
        }
        if (number < start || number > end) {
            throw new IllegalArgumentException(
                    "Number out of range [" + start + "…"+ end + "]: " + number);
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("=== Part 1: Division ===");
        System.out.print("Enter two doubles (a b): ");
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            sc.nextLine(); // прочитати залишок рядка
            double result = div(a, b);
            System.out.printf("Result of %.4f / %.4f = %.4f%n", a, b, result);
        } catch (ArithmeticException ae) {
            System.err.println("Error: " + ae.getMessage());
        } catch (InputMismatchException ime) {
            System.err.println("Error: please enter valid double numbers");
            sc.nextLine(); // скинути некоректний вхід
        }

        // --- Частина 2: введення 10 зростаючих чисел ---
        System.out.println("\n=== Part 2: Read 10 increasing integers ===");
        final int COUNT = 10;
        int[] values = new int[COUNT];
        int prev = 1;  // початкова умова: 1 < a1

        for (int i = 0; i < COUNT; i++) {
            while (true) {
                System.out.printf("Enter a%d (>%d and <100): ", i + 1, prev);
                try {
                    int num = readNumber(prev + 1, 99);
                    values[i] = num;
                    prev = num;
                    break;  // вийти з while — число прийнято
                } catch (IllegalArgumentException ex) {
                    System.err.println("Invalid input: " + ex.getMessage());
                    // цикл повториться
                }
            }
        }

        // Виведемо результат
        System.out.print("You entered: ");
        for (int v : values) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
