package com.softserve.academy.homework14;

import java.util.Date;
import java.util.Objects;

public class Product {
    int manufacturer;
    int category;
    Date date;
    int price;

    public Product(int manufacturer, int category, Date date, int price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return manufacturer == product.manufacturer && category == product.category && price == product.price && Objects.equals(date, product.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, category, date, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer=" + manufacturer +
                ", category=" + category +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
