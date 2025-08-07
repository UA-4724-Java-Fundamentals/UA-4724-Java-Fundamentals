package com.example.payment;

import java.util.Arrays;
import java.util.Comparator;

/** Тестовий клас із main() */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new SalariedEmployee("E001", "Олена Петрівна", "123-45-6789", 8000),
                new ContractEmployee("E002", "Іван Іванов", "TAX-98765", 50.0, 160),
                new SalariedEmployee("E003", "Марія Коваль", "987-65-4321", 10000),
                new ContractEmployee("E004", "Петро Гнатюк", "TAX-54321", 45.0, 170)
        };

        // Сортування в порядку спадання avg monthly pay
        Arrays.sort(employees,
                Comparator.comparingDouble(Employee::calculatePay).reversed()
        );

        // Вивід ID, ім’я та середньомісячної оплати
        System.out.println("ID\t|\tName\t\t\t|\tMonthly Pay");
        System.out.println("-----------------------------------------------------");
        for (Employee e : employees) {
            System.out.printf("%s\t|\t%-15s|\t%.2f%n",
                    e.getEmployeeId(),
                    e.getName(),
                    e.calculatePay());
        }
    }
}
