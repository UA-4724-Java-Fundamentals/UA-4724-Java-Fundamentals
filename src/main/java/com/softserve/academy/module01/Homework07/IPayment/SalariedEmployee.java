package com.softserve.academy.module01.Homework07.IPayment;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double msalary;

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, double msalary) {
        super(employeeld, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.msalary = msalary;
    }

    @Override
    public double calculatePay() {
        return msalary;
    }
}
