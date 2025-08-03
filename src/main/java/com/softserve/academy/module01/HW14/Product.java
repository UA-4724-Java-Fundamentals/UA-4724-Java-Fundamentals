package com.softserve.academy.module01.HW14;

import java.time.LocalDate;

class Product {
    private final String manufacture;
    private final String category;
    private final LocalDate dateOfManufacture;
    private final double price;

    public Product(String manufacture, String category, LocalDate dateOfManufacture, double price) {
        this.manufacture = manufacture;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getCategory() { return category; }
    public LocalDate getDateOfManufacture() { return dateOfManufacture; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return manufacture + " - " + category + " - " + dateOfManufacture + " - " + price;
    }
}

class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

