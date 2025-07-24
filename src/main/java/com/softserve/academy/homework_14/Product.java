package com.softserve.academy.homework_14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String category;
    private LocalDate manufactureDate;
    private double price;

    public Product(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "category='" + category + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", LocalDate.now().minusYears(2), 4500));
        products.add(new Product("Laptop", LocalDate.now().minusMonths(6), 12000));
        products.add(new Product("Phone", LocalDate.now().minusMonths(1).minusDays(1), 3200));
        products.add(new Product("Phone", LocalDate.now().minusYears(3), 2900));
        products.add(new Product("TV", LocalDate.now().minusYears(1), 5000));
        products.add(new Product("Phone", LocalDate.now().minusYears(5), 6700));
        products.add(new Product("Watch", LocalDate.now().minusMonths(14), 1500));
        products.add(new Product("Laptop", LocalDate.now().minusYears(2).minusMonths(3), 9800));
        products.add(new Product("Tablet", LocalDate.now().minusMonths(9), 3700));
        products.add(new Product("TV", LocalDate.now().minusYears(4).minusDays(15), 7400));
        products.add(new Product("Phone", LocalDate.now().minusMonths(3), 2100));
        products.add(new Product("Watch", LocalDate.now().minusYears(1).minusMonths(2), 2000));
        products.add(new Product("Headphones", LocalDate.now().minusDays(180), 1200));
        products.add(new Product("Phone", LocalDate.now().minusYears(6), 2800));
        products.add(new Product("Camera", LocalDate.now().minusYears(2).minusMonths(5), 5300));
        products.add(new Product("Laptop", LocalDate.now().minusMonths(18), 11000));
        products.add(new Product("TV", LocalDate.now().minusYears(3).minusDays(40), 6600));
        products.add(new Product("Watch", LocalDate.now().minusYears(1).minusMonths(2), 2000));
        products.add(new Product("Headphones", LocalDate.now().minusDays(100), 2200));
        products.add(new Product("Phone", LocalDate.now().minusYears(3), 3000));

        List<Product> filteredPhones =  products.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(date -> date.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .filter(price -> price.getPrice()>3000)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered list of phones: " + filteredPhones);

    }
}
