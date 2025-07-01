package com.softserve.academy.module01.Homework07.IPayment;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private int hoursWorked;
    private double hsalary;


    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, double hsalary, int hoursWorked) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hsalary = hsalary;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePay() {
        return hoursWorked * hsalary;
    }
}
