package com.softserve.academy.homework06.practicaltask;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(int[] purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public void addPurchase(int amount) {
        if (purchaseCount < purchaseHistory.length) {
            purchaseHistory[purchaseCount] = amount;
            purchaseCount++;
        } else {
            System.out.println("Purchase history is full. Cannot add more purchases.");
        }
    }

    public int calculateTotalExpenditure() {
        int totalExpenditure = 0;
        for (int purchase : purchaseHistory) {
            totalExpenditure += purchase;
        }
        return totalExpenditure;
    }

    public void displayPurchaseHistory() {
        System.out.println("Purchase history for " + name + ":");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println(" - Purchase " + (i + 1) + ": " + purchaseHistory[i]);
        }
    }
}
