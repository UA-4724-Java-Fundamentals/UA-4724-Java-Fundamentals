package com.softserve.academy.module01.Homework06.Task1_Birds;

public abstract class Bird {
    private String name;
    private String feathers;
    private boolean layEggs;

    public Bird(String name, String feathers, boolean layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void fly() {

    }

    public void print() {
        System.out.println("Name:" + name + " Feathers:" + feathers + "\nLay Eggs: " + layEggs);
    }
}
