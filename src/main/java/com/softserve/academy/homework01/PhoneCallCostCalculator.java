package com.softserve.academy.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCallCostCalculator {
    public static void main(String[] args) throws IOException {
        double c1, c2, c3;
        double t1, t2, t3;

        System.out.println("enter data separated by a space in the following sequence separated by a space c1 c2 c3 t1 t2 t3: ");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String pricesString = br.readLine();

        String[] parts = pricesString.split("\\s+");

        if (parts.length != 6) {
            System.out.println("Помилка: рядок має містити рівно 6 чисел.");
            return;
        }

        c1 = Double.parseDouble(parts[0]);
        c2 = Double.parseDouble(parts[1]);
        c3 = Double.parseDouble(parts[2]);
        t1 = Double.parseDouble(parts[3]);
        t2 = Double.parseDouble(parts[4]);
        t3 = Double.parseDouble(parts[5]);

        Double totalCost = c1 * t1 + c2 * t2 + c3 * t3;

        System.out.println(totalCost);
    }
}
