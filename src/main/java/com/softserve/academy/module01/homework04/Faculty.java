package com.softserve.academy.module01.homework04;

import java.util.Scanner;

public class Faculty {

    private String name;
    private int numberOfStudents;
    private Season season;

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public void displayDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Current Season: " + season.getEnglishName());
        System.out.println("Academic Period: " + season.getAcademicPeriod());
    }

    enum Season {
        WINTER("Winter", "Winter Exam Session"),
        SPRING("Spring", "Second Semester"),
        SUMMER("Summer", "Summer Break"),
        AUTUMN("Autumn", "First Semester");

        private final String englishName;
        private final String academicPeriod;

        Season(String englishName, String academicPeriod) {
            this.englishName = englishName;
            this.academicPeriod = academicPeriod;
        }

        public String getEnglishName() {
            return englishName;
        }

        public String getAcademicPeriod() {
            return academicPeriod;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the faculty name: ");
        String facultyName = scanner.nextLine();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the current season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.nextLine().toUpperCase();

        Season season = null;
        try {
            season = Season.valueOf(seasonInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season entered. Exiting...");
            scanner.close();
            return;
        }

        Faculty faculty = new Faculty(facultyName, numberOfStudents, season);

        faculty.displayDetails();

        scanner.close();
    }
}
