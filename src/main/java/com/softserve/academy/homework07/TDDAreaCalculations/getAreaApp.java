package com.softserve.academy.homework07.TDDAreaCalculations;

public class getAreaApp {
    private static Calculator sut = new Calculator();

    public static void main(String[] args) {
        double triangleBase = 6;
        double triangleHeight = 4;
        System.out.println(sut.getTotalArea(new Triangle(triangleBase, triangleHeight)));

        double height = 4;
        double width = 8;
        System.out.println(sut.getTotalArea(new Rectangle(height, width)));
    }
}
