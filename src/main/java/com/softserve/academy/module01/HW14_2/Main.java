package com.softserve.academy.module01.HW14_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> frequencyMap = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey); // повертаємо Optional<String>
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Din"),
                new Employee("Alice"),
                new Employee("Kate")
        );

        Optional<String> popularName = mostPopularName(list.stream());

        popularName.ifPresentOrElse(
                name -> System.out.println("Найпопулярніше ім'я: " + name),
                () -> System.out.println("Порожній потік")
        );
    }
}
