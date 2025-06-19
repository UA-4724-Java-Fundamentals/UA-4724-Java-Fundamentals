package com.softserve.academy.homework04;

public class BasicOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> {
                if (v2 == 0) throw new ArithmeticException("Division by zero");
                yield v1 / v2;
            }
            default -> throw new IllegalArgumentException("Unknown operator: " + op);
        };
    }
}
