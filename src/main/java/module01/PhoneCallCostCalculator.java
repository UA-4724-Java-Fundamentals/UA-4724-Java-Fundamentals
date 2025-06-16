package module01;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scr1 = new Scanner(System.in);
        System.out.println("How much does the first call cost?");
        double c1 = scr1.nextDouble();

        Scanner scr4 = new Scanner(System.in);
        System.out.println("How long was the first call?");
        double t1 = scr4.nextDouble();

        Scanner scr2 = new Scanner(System.in);
        System.out.println("How much does the second call cost?");
        double c2 = scr2.nextDouble();

        Scanner scr5 = new Scanner(System.in);
        System.out.println("How long was the second call?");
        double t2 = scr5.nextDouble();

        Scanner scr3 = new Scanner(System.in);
        System.out.println("How much does the third call cost?");
        double c3 = scr3.nextDouble();

        Scanner scr6 = new Scanner(System.in);
        System.out.println("How long was the third call?");
        double t3 = scr6.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalCost = cost1 + cost2 + cost3;
        System.out.println("The first call cost: " + cost1 + "\nThe second call cost: " + cost2 + "\nThe third call cost: " + cost3 + "\nThe total cost: " + totalCost);

    }
}
