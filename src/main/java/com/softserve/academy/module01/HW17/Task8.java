package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task8 {
    private static final String[] small = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String run(Scanner sc) {
        System.out.print("Введіть число (1..1000000): ");
        int n = sc.nextInt();
        if (n < 1 || n > 1_000_000) return "Число не у діапазоні!";
        if (n == 1_000_000) return "one million";
        return numberToWords(n).trim();
    }

    private static String numberToWords(int n) {
        if (n < 20) return small[n];
        if (n < 100) return tens[n / 10] + (n % 10 != 0 ? " " + small[n % 10] : "");
        if (n < 1000) return small[n / 100] + " hundred" + (n % 100 != 0 ? " " + numberToWords(n % 100) : "");
        if (n < 1_000_000) return numberToWords(n / 1000) + " thousand" + (n % 1000 != 0 ? " " + numberToWords(n % 1000) : "");
        return "";
    }
}

