package com.softserve.academy.homework08.practicaltask.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int width = getPositiveIntegerNumber("Width");
        int height = getPositiveIntegerNumber("Height");

        int area = squareRectangle(width, height);

        System.out.println("Area of square rectangle is: " + area);
    }

    private static int squareRectangle(int a, int b) {
        return a * b;
    }

    private static int getPositiveIntegerNumber(String nameOfNumber) {
        while (true) {
            System.out.print("Please enter a positive " + nameOfNumber + " number: ");
            try {
                int number = scanner.nextInt();
                if (number < 0) {
                    throw new IllegalArgumentException("The number must be >= 0.");
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
