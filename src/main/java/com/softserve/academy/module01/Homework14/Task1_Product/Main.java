package com.softserve.academy.module01.Homework14.Task1_Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        products.add(new Product("Phone", LocalDate.of(2023, 5, 1), 999.99));
        products.add(new Product("Phone", LocalDate.of(2025, 1, 15), 3499.00));
        products.add(new Product("Phone", LocalDate.of(2024, 12, 3), 1299.49));
        products.add(new Product("Phone", LocalDate.of(2022, 4, 22), 3799.99)); // > 3000
        products.add(new Product("Phone", LocalDate.of(2025, 6, 10), 899.00));
        products.add(new Product("Phone", LocalDate.of(2021, 2, 18), 4199.99)); // > 3000
        products.add(new Product("Phone", LocalDate.of(2024, 11, 27), 1599.00));
        products.add(new Product("Phone", LocalDate.of(2020, 3, 5), 3299.50)); // > 3000
        products.add(new Product("Phone", LocalDate.of(2022, 10, 14), 799.99));
        products.add(new Product("Phone", LocalDate.of(2025, 7, 1), 2899.00));

        products.add(new Product("Food", LocalDate.of(2025, 6, 20), 5.49));
        products.add(new Product("Clothing", LocalDate.of(2025, 3, 5), 49.99));
        products.add(new Product("Books", LocalDate.of(2023, 12, 10), 14.99));
        products.add(new Product("Furniture", LocalDate.of(2024, 11, 1), 399.00));
        products.add(new Product("Toys", LocalDate.of(2025, 2, 25), 24.50));
        products.add(new Product("Appliances", LocalDate.of(2023, 9, 14), 599.99));
        products.add(new Product("Gardening", LocalDate.of(2025, 4, 12), 29.95));
        products.add(new Product("Automotive", LocalDate.of(2024, 5, 30), 89.99));
        products.add(new Product("Office", LocalDate.of(2023, 8, 8), 12.99));
        products.add(new Product("Health", LocalDate.of(2025, 1, 7), 9.99));

        List<Product> productopt = products.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted()
                .collect(Collectors.toList());

        productopt.forEach(System.out::println);

        List<Employee> employeeList = Arrays.asList(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Alice"),
                new Employee("David"),
                new Employee("Bob"),
                new Employee("Alice")
        );
        Optional<String> popularName = Employee.mostPopularName(employeeList.stream());
        System.out.println(popularName.get());




    }
}