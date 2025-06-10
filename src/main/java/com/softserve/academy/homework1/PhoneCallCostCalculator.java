package com.softserve.academy.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c1,c2,c3;
        int t1,t2,t3;
        float cost1,cost2, cost3, totalCost;
        System.out.print("Enter cost for c1 = ");
        c1 = sc.nextFloat();
        System.out.print("Enter cost for c2 = ");
        c2 = sc.nextFloat();
        System.out.print("Enter cost for c3 = ");
        c3 = sc.nextFloat();
        System.out.print("Enter cost for t1 = ");
        t1 = sc.nextInt();
        System.out.print("Enter cost for t2 = ");
        t2 = sc.nextInt();
        System.out.print("Enter cost for t3 = ");
        t3 = sc.nextInt();
        cost1 = c1 * t1;
        System.out.println("Calculate the cost for cost1 = " + cost1);
        cost2 = c2 * t2;
        System.out.println("Calculate the cost for cost2 = " + cost2);
        cost3 = c3 * t3;
        System.out.println("Calculate the cost for cost3 = " + cost3);
        totalCost = cost1 + cost2 + cost3;
        System.out.println("Total cost = " + totalCost);






    }
}
