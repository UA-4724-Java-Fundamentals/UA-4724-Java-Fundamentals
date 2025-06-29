package com.softserve.academy.module01.Homework06.PracticalTasks.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan", "ivan@example.com", 3);
        customer.addPurchase(100);
        customer.addPurchase(200);
        customer.displayPurchaseHistory();
        System.out.println("Total: " + customer.calculateTotalExpenditure());

        System.out.println();

        PreferredCustomer preferred = new PreferredCustomer("Oksana", "oksana@example.com", 3, 0.2);
        preferred.addPurchase(100);
        preferred.addPurchase(250);
        preferred.displayPurchaseHistory();
        System.out.println("Total with discount: " + preferred.calculateTotalExpenditure());
    }
}
