package com.softserve.academy.homework_04;

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

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }




    enum Season{
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Summer Break"),
    AUTUMN("Autumn", "First Semester");

    private final String seasonEnglishName;
    private final String academicPeriod;

    Season(String seasonEnglishName, String academicPeriod) {
        this.seasonEnglishName = seasonEnglishName;
        this.academicPeriod = academicPeriod;
    }

    public String getSeasonEnglishName() {
        return seasonEnglishName;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }
}

}
