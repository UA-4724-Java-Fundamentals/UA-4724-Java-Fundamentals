package com.softserve.academy.homework06.employee;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: %.2f", getName(), getAge(), getPosition(), getSalary());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                '}';
    }
}
