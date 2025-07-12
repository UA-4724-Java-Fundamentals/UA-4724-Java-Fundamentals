package com.softserve.academy.homework07;

public class ContractEmployee extends Employee {
    private final String federalTaxIdMember;
    private final double hourlyRate;
    private final double hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, double hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}