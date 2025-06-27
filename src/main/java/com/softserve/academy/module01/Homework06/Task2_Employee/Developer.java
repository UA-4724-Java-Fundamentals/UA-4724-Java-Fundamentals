package com.softserve.academy.module01.Homework06.Task2_Employee;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, int salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, " +
                "Salary: \u20B4 %.2f.", getName(), getAge(), getPosition(), getSalary());
    }


}
