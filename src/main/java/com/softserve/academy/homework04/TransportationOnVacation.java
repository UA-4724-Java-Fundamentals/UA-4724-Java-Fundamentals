package com.softserve.academy.homework04;

public class TransportationOnVacation {
    public static void main(String[] args) {
        System.out.println(rentalCarCost(1));
    }

    public static int rentalCarCost(int d) {
        int price = d * 40;
        if (d > 6) return price - 50;
        if (d > 2) return price - 20;
        return price;
    }
}
