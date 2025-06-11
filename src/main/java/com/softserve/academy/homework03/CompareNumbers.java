package com.softserve.academy.homework03;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        int firstNumber = getNumber("Input the first number: ");
        int secondNumber = getNumber("Input the second number: ");
        int thirdNumber = getNumber("Input the third number: ");

        CompareNumbers compareNumbers = new CompareNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println(compareNumbers.getMinNumber());
    }

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

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

    public CompareNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getMinNumber() {
        return Math.min(this.firstNumber, Math.min(this.secondNumber, this.thirdNumber));
    }

    public static int getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
