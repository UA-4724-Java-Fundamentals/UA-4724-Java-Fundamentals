package com.softserve.academy.homework_03;
import java.util.Scanner;

public class TriangleAreaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstSide = getNumber(scanner, "Enter side1: ");
        double secondSide = getNumber(scanner, "Enter side2: ");
        double thirdSide = getNumber(scanner, "Enter side3: ");


        TriangleArea triangle = new TriangleArea(firstSide,secondSide,thirdSide );

        if (triangle.isValid()) {
            double area = triangle.calculateArea();
            System.out.printf("The area of the triangle is: %.2f%n", area);
        }
        else {
            System.out.println("A triangle with such sides cannot exist.");
        }

        }
    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }


}
