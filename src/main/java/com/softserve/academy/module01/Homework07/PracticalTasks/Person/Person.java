package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public abstract class Person {
    private String name;

    abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
