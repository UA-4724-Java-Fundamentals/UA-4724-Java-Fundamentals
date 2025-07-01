package com.softserve.academy.module01.Homework07.IPayment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("E001", "Olena", "123-45-6789", 6000.00),
                new ContractEmployee("E002", "Ivan", "456-78-90", 600.00, 8),
                new ContractEmployee("E003", "Anastasia", "789-90", 700.00, 12),
                new SalariedEmployee("E004", "Maksym", "456-78-90", 8000.00)};

        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeld() + " " + employee.getName() + " " + employee.calculatePay());
        }
    }

}
