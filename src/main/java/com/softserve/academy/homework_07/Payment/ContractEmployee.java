package com.softserve.academy.homework_07.Payment;

// ContractEmployee class extends Employee and represents hourly-paid workers.
// It stores federal tax ID, hourly rate, hours worked, and employee's name.
class ContractEmployee extends Employee {
    private String federalTaxIdmember; // Federal tax ID
    private double hourlyRate;          // Hourly payment rate
    private int hoursWorked;            // Number of hours worked
    private String name;                // Employee's name

    // Constructor initializes all fields, including those from Employee
    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, double hourlyRate, int hoursWorked) {
        super(employeeld);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculatePay returns salary based on hourly rate and hours worked
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }
}
