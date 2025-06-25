package com.softserve.academy.module4;

/**
 * This class demonstrates the usage of if-else statements and ternary operators in Java.
 * It provides examples of conditional logic and shows different ways to implement conditions.
 */
public class IfExample {

    public static void main(String[] args) {
        IfExample example = new IfExample();
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        TernaryOperatorService ternaryService = new TernaryOperatorService();
        example.analyzeNumbers(numberAnalyzer);
        example.useTernaryOperators(ternaryService);
    }

    /**
     * Analyzes numbers using if-else statements to check various properties.
     * Shows how to check if a number is positive, negative, zero, even, or odd.
     *
     * @param analyzer the analyzer to use for number analysis
     */
    private void analyzeNumbers(NumberAnalyzer analyzer) {
        System.out.println("\n--- Number Analysis Example ---");
        int number = -10;
        analyzer.analyzeNumber(number);
        int positiveNumber = 12;
        System.out.println("\nAnalyzing positive number: " + positiveNumber);
        analyzer.analyzeNumber(positiveNumber);
    }

    /**
     * Uses ternary operators for conditional expressions.
     * Shows how ternary operators can be used as a shorthand for if-else statements.
     *
     * @param service the service to use for ternary operations
     */
    private void useTernaryOperators(TernaryOperatorService service) {
        System.out.println("\n--- Ternary Operator Examples ---");
        int a = 5;
        int b = 4;
        service.checkEquality(a, b);
        service.compareNumbers(a, b);
    }
}

/**
 * Service class that provides methods for analyzing numbers.
 * This separates the number analysis logic from the demonstration code.
 */
class NumberAnalyzer {

    /**
     * Analyzes a number and prints information about it.
     * Checks if the number is positive, negative, zero, even, or odd.
     *
     * @param number the number to analyze
     */
    public void analyzeNumber(int number) {
        // Using if-else statement to check if the number is positive, negative, or zero
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else if (number % 2 != 0) {
                System.out.println("The number is odd.");
            }
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is not positive");
        }
        System.out.println("End of the program.");
        if (number < 0) System.out.println("The number is negative.");
        System.out.println("End of the program with negative check.");
    }
}

/**
 * Service class that provides methods for working with ternary operators.
 * This separates the ternary operator logic from the demonstration code.
 */
class TernaryOperatorService {

    /**
     * Checks equality of two numbers after decrementing the first one.
     *
     * @param a first number
     * @param b second number
     */
    public void checkEquality(int a, int b) {
        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Decrement a and check if it equals b
        String str1 = (--a == b) ? "a is equal to b" : "a is not equal to b";
        System.out.println(str1);
        System.out.println("After decrement: a = " + a);
    }

    /**
     * Compares two numbers using a ternary operator.
     *
     * @param a first number
     * @param b second number
     */
    public void compareNumbers(int a, int b) {
        char res = (a > b) ? 'A' : 'B';
        System.out.println("Result of the ternary operator (a > b): " + res);
    }
}
