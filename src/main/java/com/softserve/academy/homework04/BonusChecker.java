package com.softserve.academy.homework04;

public class BonusChecker {
    public static void main(String[] args) {
        System.out.println(bonusTime(10000, false));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        return "£" + (bonus ? salary * 10:  salary);
    }
}
