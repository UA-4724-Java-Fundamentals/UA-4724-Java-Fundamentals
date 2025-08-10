package module13.homework;

import java.time.Year;

public class Homework3 {

    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        System.out.println("--- Завдання 3: Перевірка на високосний рік ---");
        System.out.println("Чи є 2024 рік високосним? " + isLeapYear(2024));
        System.out.println("Чи є 2100 рік високосним? " + isLeapYear(2100));
        System.out.println("Чи є 2000 рік високосним? " + isLeapYear(2000));
    }
}