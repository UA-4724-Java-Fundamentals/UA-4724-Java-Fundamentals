package com.softserve.academy.module01.Homework06.PracticalTasks.Customer;

public class Customer {
    protected String name;
    protected String email;
    protected int[] purchaseHistory;
    protected int purchaseCount;

    public Customer(String name, String email, int maxPurchases) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new int[maxPurchases];
        this.purchaseCount = 0;
    }

    public void addPurchase(int amount) {
        if (purchaseCount == purchaseHistory.length) {
            System.out.println("Full");
        } else {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        }
    }

    public int calculateTotalExpenditure() {
        int totalExpenditure = 0;
        for (int i = 0; i < purchaseCount; i++) {
            totalExpenditure += purchaseHistory[i];
        }
        return totalExpenditure;
    }

    public void displayPurchaseHistory() {
        System.out.println("Purchase history for " + name + ":");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println("Purchase " + (i + 1) + ": " + purchaseHistory[i]);
        }
    }
}
