package com.softserve.academy.module01.Homework06.Task2_Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ihor", 23, 50000);
        Developer developer = new Developer("Anna", 27, 90500, "Project Manager");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }
}
