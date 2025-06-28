package com.softserve.academy.homework07.optional.one;

public class ContractEmployee extends Employee implements Payment {
    private double fixedMonthlyPayment;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double fixedMonthlyPayment, String federalTaxIdMember) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", federalTaxIdMember=" + federalTaxIdMember +
                '}';
    }
}
