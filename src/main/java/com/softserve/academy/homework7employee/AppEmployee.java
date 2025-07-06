package com.softserve.academy.homework7employee;

public class AppEmployee {
    public static void main(String[] args) {
        Employee employees = new Employee("Taras", 32 , 32735.35);
        Developer developers = new Developer("Taras", 32, 32735.35, "Average Java developer");
        System.out.println(employees.report());
        System.out.println(developers.report());



    }
}
