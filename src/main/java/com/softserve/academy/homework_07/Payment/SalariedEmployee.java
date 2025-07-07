package com.softserve.academy.homework_07.Payment;

// SalariedEmployee class extends Employee and represents employees with fixed monthly salary.
// It also stores social security number and employee's name.
class SalariedEmployee extends Employee {
    private String socialSecurityNumber; // Social security number
    private double fixedMonthlyPayment;  // Fixed monthly salary
    private String name;                  // Employee's name

    // Constructor initializes all fields, including those from Employee
    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeld);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    // Implementation of calculatePay returns fixed salary
    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }
}
