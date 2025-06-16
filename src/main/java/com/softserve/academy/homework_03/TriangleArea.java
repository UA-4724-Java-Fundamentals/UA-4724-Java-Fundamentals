package com.softserve.academy.homework_03;

public class TriangleArea {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public TriangleArea(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

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

    public boolean isValid() {
        return firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide;
    }

    public double calculateArea() {
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
        double triangleArea = Math.sqrt(semiPerimeter *
                (semiPerimeter - firstSide) *
                (semiPerimeter - secondSide) *
                (semiPerimeter - thirdSide));
        return triangleArea;


    }
}
