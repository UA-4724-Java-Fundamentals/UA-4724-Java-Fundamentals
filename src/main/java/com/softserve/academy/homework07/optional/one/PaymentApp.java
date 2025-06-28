package com.softserve.academy.homework07.optional.one;

import java.util.Arrays;

public class PaymentApp {
    public static void main(String[] args) {
        Payment[] employees = new Payment[]{
                new ContractEmployee("12", "Alex", 2500, "123"),
                new SalariedEmployee("1", "Valeriia", 20, 160, "456"),
                new SalariedEmployee("4", "Mike", 13, 160, "789"),
                new SalariedEmployee("1", "Valeriia", 17, 160, "1013")
        };

        Arrays.sort(employees, new EmployeeByWageDescComparator());

        for (Payment payment : employees) {
            if (payment instanceof Employee employee) {
                System.out.printf("ID: %s | Name: %s | Avg Monthly Wage: %.2f%n",
                        employee.getEmployeeId(), employee.getName(), payment.calculatePay());
            }
        }
    }
}
