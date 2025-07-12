package com.softserve.academy.homework07;

public class SalariedEmployee extends Employee {
    private final String socialSecurityNumber;
    private final double fixedMonthlySalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlySalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlySalary;
    }
}
