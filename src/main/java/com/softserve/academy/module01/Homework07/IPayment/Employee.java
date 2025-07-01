package com.softserve.academy.module01.Homework07.IPayment;

public abstract class Employee implements Comparable<Employee>, Payment {
    protected String employeeld;
    protected String name;

    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeld() {
        return employeeld;
    }


    @Override
    public int compareTo(Employee o) {
        return -Double.compare(o.calculatePay(), this.calculatePay());
    }
}
