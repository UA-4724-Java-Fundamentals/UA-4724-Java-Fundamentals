package com.softserve.academy.homework06.employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Patrick", 29, 5000.0),
                new Employee("Jack", 22, 1000.0)
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
