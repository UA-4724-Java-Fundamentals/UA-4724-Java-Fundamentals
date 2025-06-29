package com.softserve.academy.module01.Homework06.PracticalTasks.PointLineColorLine;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println("Point: " + toString());
    }
}
