package com.softserve.academy.homework07.TDDAreaCalculations;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            System.out.println("Error: Side must be greater than zero.");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("Error: Side must be greater than zero.");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}