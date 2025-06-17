package com.softserve.academy.homework04;

public class Product {

    public static void main(String[] args) {
        Product product1 = new Product("headphone", 200, 4);
        Product product2 = new Product("phone", 1000, 12);
        Product product3 = new Product("tablet", 1500, 5);
        Product product4 = new Product("laptop", 2000, 7);

        System.out.println("Most expensive item: " + mostExpensiveProduct.getName() + ", quantity: " + mostExpensiveProduct.getQuantity());
        System.out.println("Item with the biggest quantity: " + biggestQuantityProduct.getName());

    }

    String name;
    double price;
    int quantity;

    public static Product mostExpensiveProduct = null;
    public static Product biggestQuantityProduct = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        updateMostExpensiveProduct(this);
        updateBiggestQuantityProduct(this);
    }

    private static void updateMostExpensiveProduct(Product product) {
        if (mostExpensiveProduct == null || product.price > mostExpensiveProduct.price) {
            mostExpensiveProduct = product;
        }
    }

    private static void updateBiggestQuantityProduct(Product product) {
        if (biggestQuantityProduct == null || product.quantity > biggestQuantityProduct.quantity) {
            biggestQuantityProduct = product;
        }
    }
}
