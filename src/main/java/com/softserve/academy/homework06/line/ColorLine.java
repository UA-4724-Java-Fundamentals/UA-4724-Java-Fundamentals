package com.softserve.academy.homework06.line;


public class ColorLine extends Line {
    private String color;

    public ColorLine(String color, Point point1, Point point2) {
        super(point1, point2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("print Color: " + this.toString());
    }

    @Override
    public String toString() {
        return "Color: " + this.color +
                ", Point1: " + this.getPoint1() +
                ", Point2: " + this.getPoint2();
    }
}
