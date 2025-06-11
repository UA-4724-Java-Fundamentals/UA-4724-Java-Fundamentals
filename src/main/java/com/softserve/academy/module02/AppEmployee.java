package com.softserve.academy.module02;

public class AppEmployee {

    public static void main(String[] args) {
        Employee e1  = new Employee("Ivan", 10, 40);
        Employee e2  = new Employee("Petro", 20, 40);
        Employee e3  = new Employee("Ira", 30, 40);
        //
        System.out.println("e1.getSalary() = " + e1.getSalary());
        System.out.println("e2.getSalary() = " + e2.getSalary());
        System.out.println("e3.getSalary() = " + e3.getSalary());
        //
        System.out.println("Employee.getTotalSum() = " + Employee.getTotalSum());
    }
}
