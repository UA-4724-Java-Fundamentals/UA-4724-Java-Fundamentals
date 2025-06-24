package com.softserve.academy.homework06.practicaltask;

public class CustomerApp {
    public static void main(String[] args) {
        PreferredCustomer customerOlena = new PreferredCustomer("Olena", "olena@email.com", 3, 15);
        customerOlena.addPurchase(99);
        customerOlena.addPurchase(250);
        customerOlena.displayPurchaseHistory();
        System.out.println("Total spent: " + customerOlena.calculateTotalExpenditure());
        customerOlena.addPurchase(300);
        customerOlena.addPurchase(400);
        customerOlena.displayPurchaseHistory();
        System.out.println("=============================================");
        Customer customerMax = new Customer("Max", "max@email.com", 3);
        customerMax.addPurchase(99);
        customerMax.addPurchase(250);
        customerMax.displayPurchaseHistory();
        System.out.println("Total spent: " + customerMax.calculateTotalExpenditure());
        customerMax.addPurchase(300);
        customerMax.addPurchase(400);
        customerMax.displayPurchaseHistory();
    }
}
