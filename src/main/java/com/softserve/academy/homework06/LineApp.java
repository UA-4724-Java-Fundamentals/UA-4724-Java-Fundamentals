package com.softserve.academy.homework06;

public class LineApp {
    public static void main(String[] args) {
        Line[] lines = new Line[]{
                new Line(new Point(-1, 1), new Point(-2, 2)),
                new ColorLine("green", new Point(-4, 4), new Point(-5, 5)),
                new Line(new Point(-7, 7), new Point(-8, 8)),

        };
        for (Line line : lines) {
            line.print();
            System.out.println("---------------------");
        }
    }
}
