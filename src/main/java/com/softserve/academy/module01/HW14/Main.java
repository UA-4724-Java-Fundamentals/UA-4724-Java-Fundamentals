package com.softserve.academy.module01.HW14;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Samsung", "Phone", LocalDate.now().minusYears(2), 4500),
                new Product("Apple", "Phone", LocalDate.now().minusYears(1).minusDays(1), 5000),
                new Product("Xiaomi", "Phone", LocalDate.now(), 2500),
                new Product("LG", "TV", LocalDate.now().minusYears(2), 3200),
                new Product("Sony", "Phone", LocalDate.now().minusYears(3), 6000),
                new Product("Huawei", "Phone", LocalDate.now().minusYears(2), 2900),
                new Product("Nokia", "Phone", LocalDate.now().minusYears(2), 3100),
                new Product("Asus", "Laptop", LocalDate.now().minusYears(2), 7000),
                new Product("HP", "Laptop", LocalDate.now(), 3400),
                new Product("Dell", "Laptop", LocalDate.now(), 3600),
                new Product("Samsung", "TV", LocalDate.now().minusYears(2), 3800),
                new Product("Apple", "Phone", LocalDate.now().minusYears(2), 4500),
                new Product("Xiaomi", "Phone", LocalDate.now().minusYears(2), 3050),
                new Product("Sony", "Phone", LocalDate.now(), 2000),
                new Product("Samsung", "Phone", LocalDate.now().minusYears(2), 3999),
                new Product("Realm", "Phone", LocalDate.now().minusYears(1), 2800),
                new Product("Motorola", "Phone", LocalDate.now().minusYears(2), 3100),
                new Product("Samsung", "Phone", LocalDate.now().minusYears(3), 7000),
                new Product("Apple", "Phone", LocalDate.now().minusYears(2), 3500),
                new Product("Honor", "Phone", LocalDate.now().minusYears(2), 3300)
        );

        List<Product> filtered = products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        System.out.println("Телефони > 3000 грн, старші 1 року:");
        filtered.forEach(System.out::println);
    }

}
