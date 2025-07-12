package com.softserve.academy.homework07;

public abstract class Employee implements Payment {
    private final String employeeId;
    private final String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

    public void printDetails() {
        System.out.printf("ID: %s | Name: %s | Avg. Monthly Pay: %.2f%n", employeeId, name, calculatePay());
    }
}
