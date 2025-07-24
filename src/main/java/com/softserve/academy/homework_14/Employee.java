package com.softserve.academy.homework_14;

import java.util.List;
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

    static Optional<String> mostPopularName(Stream<Employee> employees) {

        Map<String, Long> nameCounts = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        return nameCounts.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .filter(entry -> entry.getValue().size() == 1)
                .map(entry -> entry.getValue().get(0));


    }

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")

        );

        Optional<String> popular = Employee.mostPopularName(list.stream());
        System.out.println(popular.orElse("No popular name"));
    }


}
