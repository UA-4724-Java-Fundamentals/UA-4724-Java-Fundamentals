package com.softserve.academy.homework05;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employeeAlice = new Employee("Alice", 101, 5000);
        Employee employeeBob = new Employee("Bob", 102, 6000);
        Employee employeeCharlie = new Employee("Charlie", 101, 4500);
        Employee employeeDiana = new Employee("Diana", 103, 7000);
        Employee employeeEve = new Employee("Eve", 102, 6500);

        Employee[] employees = {employeeAlice, employeeBob, employeeCharlie, employeeDiana, employeeEve};

        System.out.print("Enter employee department: ");
        int departmentNumber = scanner.nextInt();

        getAllEmployeesCertainDepartment(employees, departmentNumber);
        sortEmployeesBySalaryDesc(employees);

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Sorted by salary descending: ");
        System.out.println(Arrays.toString(employees));
    }

    static void getAllEmployeesCertainDepartment(Employee[] employees, int departmentNumber) {
        for (Employee employee : employees) {
            if (employee.getdepartmentNumber() == departmentNumber) System.out.println(employee);
        }
    }

    static void sortEmployeesBySalaryDesc(Employee[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee current = employees[i];
            int j = i - 1;

            while (j >= 0 && employees[j].getSalary() < current.getSalary()) {
                employees[j + 1] = employees[j];
                j--;
            }

            employees[j + 1] = current;
        }
    }

}
