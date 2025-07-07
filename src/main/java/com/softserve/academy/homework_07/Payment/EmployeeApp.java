package com.softserve.academy.homework_07.Payment;// Main class with main() method to run the application
import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        // Create an array of Employee objects with both SalariedEmployee and ContractEmployee
        Employee[] employees = new Employee[4];

        // Initialize employees with sample data
        employees[0] = new SalariedEmployee("E001", "Alice", "SSN123", 3000);
        employees[1] = new ContractEmployee("E002", "Bob", "FTID456", 20, 160);  // 20 * 160 = 3200
        employees[2] = new SalariedEmployee("E003", "Charlie", "SSN789", 2800);
        employees[3] = new ContractEmployee("E004", "Diana", "FTID012", 25, 140); // 25 * 140 = 3500

        // Sort the employees array using natural order defined by compareTo (salary descending)
        Arrays.sort(employees);

        // Print header for the output
        System.out.println("Employee ID | Name    | Average Monthly Salary");
        System.out.println("----------------------------------------------");

        // Loop through sorted employees and print their info
        for (Employee emp : employees) {
            String name = "";
            // Get employee name depending on instance type
            if (emp instanceof SalariedEmployee) {
                name = ((SalariedEmployee) emp).getName();
            } else if (emp instanceof ContractEmployee) {
                name = ((ContractEmployee) emp).getName();
            }
            // Print employee ID, name, and calculated average monthly salary formatted to 2 decimals
            System.out.printf("%11s | %-7s | %.2f\n", emp.getEmployeeld(), name, emp.calculatePay());
        }
    }
}
