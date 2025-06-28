package com.softserve.academy.homework07.TDDAreaCalculations;

public class Calculator {
    //рішення не моє, бо не знав про Shape... shapes але воно дійсно круте
    public double getTotalArea(Shape... shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }

        return Math.round(total * 100.0) / 100.0;
    }
}