package com.softserve.academy.homework06.practicaltask;

public class PreferredCustomer extends Customer {
    double discountRate = 0;

    public PreferredCustomer(String name, String email, int maxPurchases, double discountRate) {
        super(name, email, maxPurchases);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int applyDiscount(int amount) {
        return (int) (amount - (amount * discountRate / 100));
    }

    @Override
    public void addPurchase(int amount) {
        int discountedAmount = applyDiscount(amount);
        if (purchaseCount < purchaseHistory.length) {
            this.purchaseHistory[this.purchaseCount] = discountedAmount;
            System.out.printf("Adding purchase with discount: Original: $%d, After Discount: $%d%n", amount, discountedAmount);
            this.purchaseCount++;
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }

    @Override
    public void displayPurchaseHistory() {
        System.out.println("Purchase history for " + name + ":");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println(" - Purchase " + (i + 1) + ": " + purchaseHistory[i]);
        }
    }
}
