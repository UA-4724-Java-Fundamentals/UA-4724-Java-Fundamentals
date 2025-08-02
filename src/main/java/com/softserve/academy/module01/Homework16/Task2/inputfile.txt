package com.softserve.academy.module01.Homework14.Task1_Product;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(
                        name -> name,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
