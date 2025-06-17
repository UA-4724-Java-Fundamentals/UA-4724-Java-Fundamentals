package com.softserve.academy.homework04;

import java.util.Scanner;

public class DayOfTheWeek {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of Day (1–7): ");
        int numOfDay = Integer.parseInt(scanner.nextLine());
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek(numOfDay);
        System.out.println(dayOfTheWeek.getNameOfDay());
    }

    int numOfDay;

    DayOfTheWeek(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public String getNameOfDay() {
        return switch (this.numOfDay) {
            case 1 -> "monday, понеділок";
            case 2 -> "tuesday, вівторок";
            case 3 -> "wednesday, середа";
            case 4 -> "thursday, четвер";
            case 5 -> "friday, п'ятниця";
            case 6 -> "saturday, субота";
            case 7 -> "sunday, неділя";
            default -> {
                System.out.println("Invalid day number: " + this.numOfDay);
                yield "nothing";
            }
        };
    }
}
