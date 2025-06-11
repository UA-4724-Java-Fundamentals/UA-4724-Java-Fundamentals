package com.softserve.academy.module02;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private double salary;

    private static double totalSum = 0;

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        salary = rate * hours;
        totalSum = totalSum + salary;
        return salary;
    }

    public double getBonuses() {
        return salary * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + salary +
                '}';
    }
}
