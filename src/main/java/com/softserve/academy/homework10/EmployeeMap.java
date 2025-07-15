package com.softserve.academy.homework10;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeMap {
    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, Employee> map = new LinkedHashMap<>();

    private static class Employee {
        private String name;
        private String position;
        private double salary;
        private LocalDate birthDate;

        public Employee(String name, LocalDate birthDate, double salary, String position) {
            this.name = name;
            this.birthDate = birthDate;
            this.salary = salary;
            this.position = position;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(birthDate, employee.birthDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, position, salary, birthDate);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", position='" + position + '\'' +
                    ", salary=" + salary +
                    ", birthDate=" + birthDate +
                    '}';
        }
    }

    public static void main(String[] args) {
        runMainMenu();
    }

    private static int getID() {
        while (true) {
            try {
                System.out.print("Enter employee ID: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (id > 0) return id;
                System.out.println("ID must be positive.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format.");
            }
        }
    }

    private static Employee getEmployeeFromConsole() {
        while (true) {
            try {
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();

                System.out.print("Enter employee birth date (YYYY-MM-DD): ");
                LocalDate birthDate = LocalDate.parse(scanner.nextLine());

                System.out.print("Enter employee position: ");
                String position = scanner.nextLine();

                System.out.print("Enter employee salary: ");
                double salary = Double.parseDouble(scanner.nextLine());

                return new Employee(name, birthDate, salary, position);
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    private static void addEmployee() {
        int id = getID();
        if (map.containsKey(id)) {
            System.out.println("Employee with this ID already exists.");
            return;
        }

        Employee newEmployee = getEmployeeFromConsole();

        for (Employee e : map.values()) {
            if (e.getName().equalsIgnoreCase(newEmployee.getName())) {
                System.out.println("Employee with name '" + newEmployee.getName() + "' already exists.");
                return;
            }
        }

        map.put(id, newEmployee);
        System.out.println("Employee added successfully.");
    }

    private static void changeEmployee() {
        if (map.isEmpty()) {
            System.out.println("Employee list is empty.");
            return;
        }
        int id = getID();
        if (!map.containsKey(id)) {
            System.out.println("No employee found with this ID.");
            return;
        }

        System.out.println("Editing employee: " + map.get(id));

        Employee updated = getEmployeeFromConsole();
        map.put(id, updated);
        System.out.println("Employee updated.");
    }

    private static void showEmployees() {
        if (map.isEmpty()) {
            System.out.println("No employees in the system.");
            return;
        }

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " => " + entry.getValue());
        }
    }

    private static void sortEmployees() {
        if (map.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }

        System.out.println("Sort by: 1-ID, 2-Name, 3-Position, 4-Salary, 5-BirthDate");
        String choice = scanner.nextLine();

        List<Map.Entry<Integer, Employee>> entries = new ArrayList<>(map.entrySet());

        switch (choice) {
            case "1":
                entries.sort(Comparator.comparingInt(Map.Entry::getKey));
                break;
            case "2":
                entries.sort(Comparator.comparing(e -> e.getValue().getName()));
                break;
            case "3":
                entries.sort(Comparator.comparing(e -> e.getValue().getPosition()));
                break;
            case "4":
                entries.sort(Comparator.comparing(e -> e.getValue().getSalary()));
                break;
            case "5":
                entries.sort(Comparator.comparing(e -> e.getValue().getBirthDate()));
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        map.clear();

        for (Map.Entry<Integer, Employee> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        System.out.println("All employees have been sorted.");
    }

    private static void runMainMenu() {
        boolean running = true;

        while (running) {
            System.out.println("=== Main Menu ===");
            System.out.println("1. Show Employees");
            System.out.println("2. Add Employee");
            System.out.println("3. Change Employee");
            System.out.println("4. Sort Employees");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    showEmployees();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    changeEmployee();
                    break;
                case "4":
                    sortEmployees();
                    break;
                case "0":
                    running = false;
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
