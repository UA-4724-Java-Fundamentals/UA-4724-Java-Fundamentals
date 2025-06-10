package com.softserve.academy.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClothingStoreReceipt {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter Customer's name: ");
        BufferedReader brCustomerName = new BufferedReader(
                new InputStreamReader(System.in));
        String customerName = brCustomerName.readLine();

        System.out.print("Enter Number of items bought: ");
        BufferedReader brItemsBought = new BufferedReader(
                new InputStreamReader(System.in));
        int itemsBought = Integer.parseInt(brItemsBought.readLine());

        System.out.print("Price per item: ");
        BufferedReader brItemPrice = new BufferedReader(
                new InputStreamReader(System.in));
        double itemPrice = Double.parseDouble(brItemPrice.readLine());

        double totalCost = itemPrice * itemsBought;

        System.out.print("Payment method: ");
        BufferedReader brPaymentMethod = new BufferedReader(
                new InputStreamReader(System.in));
        String paymentMethod = brPaymentMethod.readLine();


        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}