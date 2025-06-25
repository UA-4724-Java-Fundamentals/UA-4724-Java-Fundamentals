package com.softserve.academy.module4;

/**
 * This class shows the usage of unary operators in Java.
 * It provides examples of pre-increment, post-increment, and their effects on variables.
 */
public class UnaryOperatorsExample {
    public static void main(String[] args) {
        UnaryOperatorsExample example = new UnaryOperatorsExample();// Create an instance of UnaryOperatorsExample
        UnaryOperatorService service = new UnaryOperatorService();// Create an instance of UnaryOperatorService
        example.showBasicUnaryOperators(service);
        example.showComplexExpressions(service);
        example.showErrorCases();
    }

    /**
     * Shows basic unary operators like post-increment.
     * Displays the difference between the value of a variable before and after increment.
     *
     * @param service the service to use for unary operations
     */
    private void showBasicUnaryOperators(UnaryOperatorService service) {
        System.out.println("\n--- Basic Unary Operators Example ---");
        service.usePostIncrement(5);
    }

    /**
     * Shows complex expressions with unary operators.
     * Displays how multiple increments in a single expression are evaluated.
     *
     * @param service the service to use for unary operations
     */
    private void showComplexExpressions(UnaryOperatorService service) {
        System.out.println("\n--- Complex Unary Expressions Example ---");
        service.calculateWithMultipleIncrements(6);
    }

    /**
     * Shows cases that would cause compilation errors.
     * These examples are kept as comments to preserve the original error examples.
     */
    private void showErrorCases() {
        System.out.println("\n--- Error Cases (Commented Out) ---");
        System.out.println("// int d = ++(a + b); // This line would cause a compilation error");
        System.out.println("// Reason: You cannot apply unary operators directly to an expression like (a + b).");
    }
}

/**
 * Service class that provides methods for working with unary operators.
 * This separates the unary operator logic from the example code.
 */
class UnaryOperatorService {

    /**
     * Uses the post-increment operator and shows its effect.
     * Displays how the value is first used and then incremented.
     *
     * @param initialValue the initial value to use for the demonstration
     */
    public void usePostIncrement(int initialValue) {
        int a = initialValue;
        int b = a++; // b gets the value of a (initialValue), then a is incremented to initialValue+1

        System.out.println("Initial value of a: " + initialValue);
        System.out.println("After post-increment:");
        System.out.println("a: " + a); // Will print initialValue + 1
        System.out.println("b: " + b); // Will print initialValue
    }

    /**
     * Calculates with multiple increment operations in a single expression.
     * Shows how pre-increment and post-increment operators affect the calculation.
     *
     * @param startingValue the starting value to use for the demonstration
     */
    public void calculateWithMultipleIncrements(int startingValue) {
        int a = startingValue;

        System.out.println("Starting value of a: " + a);
        int c = ++a + ++a + a++ + a++;

        System.out.println("Expression: ++a + ++a + a++ + a++");
        System.out.println("Evaluation steps:");
        System.out.println("1. ++a: a becomes " + (startingValue + 1) + ", expression value is " + (startingValue + 1));
        System.out.println("2. ++a: a becomes " + (startingValue + 2) + ", expression value is " + (startingValue + 2));
        System.out.println("3. a++: expression value is " + (startingValue + 2) + ", then a becomes " + (startingValue + 3));
        System.out.println("4. a++: expression value is " + (startingValue + 3) + ", then a becomes " + (startingValue + 4));
        System.out.println("Final value of a: " + a);
        System.out.println("Result of expression (c): " + c);
    }
}
