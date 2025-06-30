package com.softserve.academy.module07inter;

class Cube extends Shape implements Vertexable, Volumetric {
    private double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public int getNumberOfVertex() {
        return 8;
    }
}
