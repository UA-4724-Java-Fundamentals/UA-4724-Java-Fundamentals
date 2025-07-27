package com.softserve.academy.homework14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeApp {

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCounts = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> popularName = mostPopularName(employees.stream());
        System.out.println("Most popular name: " + popularName.orElse("No employees"));
    }
}
