package com.softserve.academy.module01.Homework06.PracticalTasks.PointLineColorLine;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(0, 0), new Point(10, 10));
        lines[1] = new ColorLine("black", new Point(0, 6), new Point(11, 12));
        lines[2] = new Line(new Point(7, 2), new Point(11, 18));
        lines[3] = new ColorLine("Red", new Point(2, 16), new Point(7, 14));

        for (Line line : lines) {
            line.print();
        }
    }

}
