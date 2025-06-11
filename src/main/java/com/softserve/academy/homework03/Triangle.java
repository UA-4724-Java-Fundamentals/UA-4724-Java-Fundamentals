package com.softserve.academy.homework03;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        double firstSide = getNumber("Enter side 1: ");
        double secondSide = getNumber("Enter side 2: ");
        double thirdSide = getNumber("Enter side 3: ");
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        System.out.printf("The area of the triangle: %.2f%n", triangle.getAreaOfTriangle());
    }

    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }


    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getAreaOfTriangle() {
        double s = (firstSide + secondSide + thirdSide) / 2.0;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
