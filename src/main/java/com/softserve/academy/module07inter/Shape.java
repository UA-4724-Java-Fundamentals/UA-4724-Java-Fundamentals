package com.softserve.academy.module07inter;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        //System.out.println("public Shape(String name) done");
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

}