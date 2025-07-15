package com.softserve.academy.practical11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeMap {


    static class Employee {
        private String name;
        private String position;
        private double salary;
        private LocalDate dob;

        public Employee(String name, String position, double salary, LocalDate dob) {
            this.name = name;
            this.position = position;
            this.salary = salary;
            this.dob = dob;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

        @Override
        public String toString() {
            return String.format("%s, Position: %s, Salary: $%.2f, DOB: %s",
                    name, position, salary, dob.format(DateTimeFormatter.ISO_DATE));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Employee> employeeMap = new HashMap<>();

        List<Employee> initialEmployees = List.of(
                new Employee("Julia Bondarenko", "Developer", 80000, LocalDate.of(1990, 5, 20)),
                new Employee("Andrii Petrenko", "Manager", 95000, LocalDate.of(1985, 3, 15)),
                new Employee("Diana Holovan", "Developer", 82000, LocalDate.of(1992, 11, 2)),
                new Employee("Kateryna Savchuk", "Designer", 70000, LocalDate.of(1991, 7, 10)),
                new Employee("Bohdana Dmytrenko", "Developer", 78000, LocalDate.of(1989, 8, 8)),
                new Employee("Volodymyr Voloshyn", "HR", 65000, LocalDate.of(1988, 1, 28)),
                new Employee("Dariia Kushnir", "Developer", 83000, LocalDate.of(1993, 12, 12))
        );

        Set<String> seenNames = new HashSet<>();
        boolean duplicatesFound = false;
        for (Employee e : initialEmployees) {
            if (!seenNames.add(e.getName())) {
                System.out.println("Duplicate name detected: " + e.getName() + ". Aborting map population.");
                duplicatesFound = true;
                break;
            }
        }

        if (!duplicatesFound) {
            int id = 1001;
            for (Employee e : initialEmployees) {
                employeeMap.put(id++, e);
            }
        } else {
            System.out.println("Map population halted due to duplicate names.");
            System.exit(0);
        }

        printEmployeeMap(employeeMap);

        System.out.print("\nEnter employee ID to search: ");
        int searchId = scanner.nextInt();
        scanner.nextLine();

        if (employeeMap.containsKey(searchId)) {
            System.out.println("Found: " + employeeMap.get(searchId));
        } else {
            System.out.println("ID " + searchId + " not found.");
        }

        System.out.print("\nEnter employee name to search: ");
        String searchName = scanner.nextLine();

        boolean nameFound = false;
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found ID: " + entry.getKey() + " -> " + entry.getValue());
                nameFound = true;
                break;
            }
        }
        if (!nameFound) {
            System.out.println("Name '" + searchName + "' not found.");
        }

        System.out.print("\nEnter employee ID to edit (or 0 to skip): ");
        int editId = scanner.nextInt();
        scanner.nextLine();

        if (editId != 0 && employeeMap.containsKey(editId)) {
            Employee emp = employeeMap.get(editId);
            System.out.println("Current data: " + emp);

            System.out.print("Enter new name (or press Enter to keep '" + emp.getName() + "'): ");
            String newName = scanner.nextLine();
            if (!newName.trim().isEmpty()) {
                emp.setName(newName.trim());
            }

            System.out.print("Enter new position (or press Enter to keep '" + emp.getPosition() + "'): ");
            String newPosition = scanner.nextLine();
            if (!newPosition.trim().isEmpty()) {
                emp.setPosition(newPosition.trim());
            }

            System.out.print("Enter new salary (or press Enter to keep " + emp.getSalary() + "): ");
            String salaryInput = scanner.nextLine();
            if (!salaryInput.trim().isEmpty()) {
                try {
                    double newSalary = Double.parseDouble(salaryInput);
                    emp.setSalary(newSalary);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid salary input. Keeping previous salary.");
                }
            }

            System.out.print("Enter new date of birth (yyyy-mm-dd) (or press Enter to keep " + emp.getDob() + "): ");
            String dobInput = scanner.nextLine();
            if (!dobInput.trim().isEmpty()) {
                try {
                    LocalDate newDob = LocalDate.parse(dobInput.trim());
                    emp.setDob(newDob);
                } catch (Exception e) {
                    System.out.println("Invalid date format. Keeping previous DOB.");
                }
            }

            employeeMap.put(editId, emp);
            System.out.println("Updated employee data:");
            System.out.println(editId + " -> " + employeeMap.get(editId));
        } else if (editId != 0) {
            System.out.println("Employee ID not found. Skipping edit.");
        }

        System.out.print("\nEnter sorting criterion (id, name, position): ");
        String criterion = scanner.nextLine().trim().toLowerCase();

        List<Map.Entry<Integer, Employee>> entryList = new ArrayList<>(employeeMap.entrySet());

        switch (criterion) {
            case "id":
                entryList.sort(Map.Entry.comparingByKey());
                break;
            case "name":
                entryList.sort(Comparator.comparing(e -> e.getValue().getName()));
                break;
            case "position":
                entryList.sort(Comparator.comparing(e -> e.getValue().getPosition()));
                break;
            default:
                System.out.println("Invalid criterion. Sorting by ID by default.");
                entryList.sort(Map.Entry.comparingByKey());
        }

        System.out.println("\nSorted employee list by " + criterion + ":");
        for (Map.Entry<Integer, Employee> e : entryList) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        scanner.close();
    }

    private static void printEmployeeMap(Map<Integer, Employee> map) {
        System.out.println("Employee Map Contents:");
        map.forEach((id, emp) -> System.out.println(id + " -> " + emp));
    }
}
