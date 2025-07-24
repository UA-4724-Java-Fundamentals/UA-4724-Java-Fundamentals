package com.softserve.academy.homework14;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + '}';
    }
}
