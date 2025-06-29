package com.softserve.academy.module01.Homework06.PracticalTasks.PointLineColorLine;

public class ColorLine extends Line {
    private String color;

    public ColorLine(String color, Point first, Point second) {
        super(first, second);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine (" + color + ") from " + getFirst().toString() + " to " + getSecond().toString();
    }

    public void print() {
        System.out.println(toString());
    }

}
