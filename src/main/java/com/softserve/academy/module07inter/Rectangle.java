package com.softserve.academy.module07inter;

public class Rectangle extends Shape implements Vertexable {
    private double width;
    private double height;

    public Rectangle( double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int getNumberOfVertex() {
        return 4;
    }
}
