package com.softserve.academy.homework_13;

import java.time.Year;
import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }
    public static void printLeapYearResult(int year) {
        String result = isLeapYear(year) ? "leap" : "not leap";
        System.out.println(year + " year is " + result + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid year (-3000 to 3000): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error! You must enter a number.");
            return;
        }


        int testYear = scanner.nextInt();
        if(testYear < -3000 || testYear > 3000){
            System.out.println("Error! Enter the valid year in a range -3000 to 3000: ");

        }
        else{
            printLeapYearResult(testYear);

        }
        scanner.close();

    }
}
