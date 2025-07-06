package com.softserve.academy.homework6employee;

public class Developer extends Employee{
    private String position;


    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " + "Position: %s, " + "Salary: %.2f\u20B4",
                getName(), getAge(), position, getSalary());
    }
}
