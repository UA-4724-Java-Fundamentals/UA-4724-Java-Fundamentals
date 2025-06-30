package com.softserve.academy.module07inter;

public class Appl {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Sphere(7.2),
                new Cube(5.8),
                new Cube(6.7),
                new Sphere(6.3),
                new Rectangle(4, 5),
                new Circle(6.3)
        };
        //
        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape area for " + shape.getName() + " is  = " + area);
            //
            if (shape instanceof Volumetric) {
                double volume = ((Volumetric) shape).getVolume();
                System.out.println("\tShape volume for " + shape.getName() + " is = " + volume);
            }
            //
            if (shape instanceof Vertexable) {
                int numberOfVertex = ((Vertexable) shape).getNumberOfVertex();
                System.out.println("\tNumber of vertex " + shape.getName() + " is = " + numberOfVertex);
            }
        }
    }
}
