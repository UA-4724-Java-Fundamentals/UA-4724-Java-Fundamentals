package com.softserve.academy.homework03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {

    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", new BigDecimal("5.00"), new BigDecimal("40"));
        Employee e2 = new Employee("Vlad", new BigDecimal("3.20"), new BigDecimal("36"));
        Employee e3 = new Employee("Max", new BigDecimal("4.00"), new BigDecimal("24"));

        System.out.println("Total sum: " + totalSum.setScale(2, RoundingMode.HALF_UP));
    }

    private String name;
    private BigDecimal rate;
    private BigDecimal hours;
    public static BigDecimal totalSum = BigDecimal.ZERO;

    public BigDecimal getHours() {
        return hours;
    }

    public void setHours(BigDecimal hours) {
        this.hours = hours;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, BigDecimal rate, BigDecimal hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum = totalSum.add(getSalary().add(getBonuses()));
    }

    public BigDecimal getSalary() {
        return rate.multiply(hours).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getBonuses() {
        return getSalary().multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return String.format("Employee name: %s, rate: %s, hours: %s, salary: %s, bonuses: %s",
                name, rate, hours, getSalary(), getBonuses());
    }
}

