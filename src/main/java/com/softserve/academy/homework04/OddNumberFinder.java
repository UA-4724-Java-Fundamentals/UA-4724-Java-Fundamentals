package com.softserve.academy.homework04;

import java.util.Scanner;

public class OddNumberFinder {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        String stringOfNumbers = scanner.nextLine();
        String[] parts = stringOfNumbers.split(" "); // розділяє по пробілах

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);

        OddNumberFinder oddNumberFinder = new OddNumberFinder(a, b, c);
        System.out.println(oddNumberFinder.countOddNumbers());
    }

    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    OddNumberFinder(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = secondNumber;
    }

    public String countOddNumbers() {
        int result = 0;

        if (this.firstNumber % 2 == 0)
            result++;
        if (this.secondNumber % 2 == 0)
            result++;
        if (this.thirdNumber % 2 == 0)
            result++;

        return "Count odd numbers: " + result;
    }
}
