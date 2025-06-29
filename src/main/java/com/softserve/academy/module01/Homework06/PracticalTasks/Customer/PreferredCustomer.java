package com.softserve.academy.module01.Homework06.PracticalTasks.Customer;

public class PreferredCustomer extends Customer {
    private double discountRate;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    public int applyDiscount(int amount) {
        return (int) Math.round(amount * (1 - discountRate));
    }

    @Override
    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        if (purchaseCount == purchaseHistory.length) {
            System.out.println("Full");
        } else {
            purchaseHistory[purchaseCount] = discountedAmount;
            purchaseCount++;
        }
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println("Discounted purchase history for " + name + ":");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": " + purchaseHistory[i]);
        }
    }
}
