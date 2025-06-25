package com.softserve.academy.homework05;

//name, departmentNumber number, salary.
public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getdepartmentNumber() {
        return departmentNumber;
    }

    public void setdepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "name = '" + name + '\'' +
                ", departmentNumber = '" + departmentNumber + '\'' +
                ", salary = " + salary +
                " }";
    }
}
