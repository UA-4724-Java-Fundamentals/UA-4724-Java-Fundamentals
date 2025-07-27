package com.softserve.academy.homework14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String category = (i % 2 == 0) ? "Phone" : "Laptop";
            LocalDate manufactureDate = LocalDate.now().minusMonths(i * 3);
            double price = 2500 + (i * 200);
            products.add(new Product(category, manufactureDate, price));
        }

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        List<Product> filteredSorted = products.stream()
                .filter(p -> p.getManufactureCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(oneYearAgo))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        filteredSorted.forEach(System.out::println);
    }
}

