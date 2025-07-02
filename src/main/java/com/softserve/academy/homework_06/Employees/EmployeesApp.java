package com.softserve.academy.homework_06.Employees;

public class EmployeesApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Mariia",38,55000.50);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}
