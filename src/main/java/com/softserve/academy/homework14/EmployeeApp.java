package com.softserve.academy.homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob"));
        employees.add(new Employee("Din"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Sam"));

        System.out.println(mostPopularName(employees.stream()));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()) // знаходимо ім'я з найбільшою кількістю
                .map(Map.Entry::getKey); // повертаємо тільки ім’я
    }
}
