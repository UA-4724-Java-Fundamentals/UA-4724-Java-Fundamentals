package com.softserve.academy.module01.Homework06.PracticalTasks.PointLineColorLine;

public class Line {

    private Point first;
    private Point second;

    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Line from " + first.toString() + " to " + second.toString();
    }

    public void print() {
        System.out.println(toString());
    }

}
