package com.softserve.academy.module01.homework06;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", 28, 25000.00);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}
