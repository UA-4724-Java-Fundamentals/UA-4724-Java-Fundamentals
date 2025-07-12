package com.softserve.academy.homework07;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new SalariedEmployee("SE101", "Olena Mazurenko", "123-45-6789", 4000),
                new ContractEmployee("CE202", "Julia Petrenko", "FT123456", 25.0, 160),
                new SalariedEmployee("SE102", "Yurii Bondarenko", "987-65-4321", 5000),
                new ContractEmployee("CE203", "Andrii Shevchuk", "FT654321", 30.0, 120)
        };

        Arrays.sort(employees, (a, b) -> Double.compare(b.calculatePay(), a.calculatePay()));

        System.out.println("=== Employees Sorted by Monthly Pay (Descending) ===");
        for (Employee e : employees) {
            e.printDetails();
        }
    }
}
