package com.softserve.academy.module01.Homework14.Task1_Product;

import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product implements Comparable<Product> {
    private String category;
    private LocalDate date;
    private double price;

    public Product(String category, LocalDate date, double price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(), this.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
