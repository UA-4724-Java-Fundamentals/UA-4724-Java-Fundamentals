package com.softserve.academy.homework04;

import java.util.Objects;
import java.util.Scanner;

public class Faculty {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter faculty name");
        String facultyName = scanner.nextLine();

        System.out.println("Enter number of students");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter name of season");
        String currentSeason = scanner.nextLine().toUpperCase();


        Season season = Season.finderSeason(currentSeason);
        if (season == null) {
            System.out.println("Invalid season entered.");
            return;
        }

        Faculty faculty = new Faculty(facultyName, numberOfStudents, season);

        System.out.println(faculty.getName() + " | " + faculty.getNumberOfStudents() +
                " students | Season: " + faculty.getSeason().getEnglishName() +
                " | Academic period: " + faculty.getSeason().getAcademicPeriod());
    }

    private String facultyName;
    private int numberOfStudents;
    private Season season;

    public Faculty(String facultyName, int numberOfStudents, Season season) {
        this.facultyName = facultyName;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public String getName() {
        return facultyName;
    }

    public void setName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public enum Season {
        WINTER("WINTER", "Winter Exam Session"),
        SPRING("SPRING", "Second Semester"),
        SUMMER("SUMMER", "Summer Break"),
        AUTUMN("AUTUMN", "First Semester");

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

        public static Season finderSeason(String season) {
            for (Season item : values()) {
                if (Objects.equals(item.englishName, season)) {
                    return item;
                }
            }
            return null;
        }
    }
}
