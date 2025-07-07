package com.softserve.academy.homework_07.Payment;

// Abstract class Employee implements Comparable<Employee> and Payment.
// It serves as a base class for all types of employees.
// It contains a String employeeld and implements comparison by salary for sorting.
public abstract class Employee implements Comparable<Employee>, IPayment {
    String employeeld;  // Employee ID

    // Constructor to set the employee ID
    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    // Getter for employee ID
    public String getEmployeeld() {
        return employeeld;
    }

    // Implement compareTo method from Comparable interface
    // Compares two employees by their average monthly salary in descending order
    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.calculatePay(), this.calculatePay());
    }
}
