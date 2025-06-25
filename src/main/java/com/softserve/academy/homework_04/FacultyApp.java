package com.softserve.academy.homework_04;

import java.util.Scanner;

public class FacultyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the faculty name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.nextLine().toUpperCase();

        try {
            Faculty.Season season = Faculty.Season.valueOf(seasonInput);


            Faculty faculty = new Faculty(name, numberOfStudents, season);


            System.out.println("Faculty name: " + faculty.getName());
            System.out.println("Number of students: " + faculty.getNumberOfStudents());
            System.out.println("Season: " + faculty.getSeason().getSeasonEnglishName());
            System.out.println("Academic period: " + faculty.getSeason().getAcademicPeriod());
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid season is entered");
        }


    }
}
