package com.softserve.academy.homework3;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(){};

    public Triangle(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
    public double getSquare() {
        double d = (side1 + side2 + side3) / 2;
        return Math.sqrt(d * (d - side1) * (d - side3) * (d - side2));
    }
}
