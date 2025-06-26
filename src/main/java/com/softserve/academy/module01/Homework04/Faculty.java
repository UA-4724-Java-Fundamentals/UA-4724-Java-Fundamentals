package com.softserve.academy.module01.Homework04;

import java.util.Scanner;

public class Faculty {

    enum Season {
        WINTER("Winter", "Зимова екзаменаційна сесія"),
        SPRING("Spring", "Другий семестр"),
        SUMMER("Summer", "Літні канікули"),
        AUTUMN("Autumn", "Перший семестр");

        private String period;
        private String name;


        Season(String name, String period) {
            this.name = name;
            this.period = period;
        }

        public String getName() {
            return name;
        }

        public String getPeriod() {
            return period;
        }
    }

    private String name;
    private int numberOfStudents;
    private Season season;

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void input(Faculty faculty) {
        System.out.println(faculty.getName() + " " +
                faculty.getNumberOfStudents() + " " + faculty.getSeason().getName());
        System.out.println(faculty.getSeason().getPeriod());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty faculty = new Faculty();

        System.out.println("Введіть назву факультету, кількість студентів та поточний сезон:");
        System.out.println("Введіть назву факультету:");
        String facultyName = sc.nextLine();

        System.out.println("Введіть кількість студентів:");
        int studentCount = sc.nextInt();
        sc.nextLine();

        System.out.println("Введіть сезон (WINTER, SPRING, SUMMER, AUTUMN):");
        String seasonInput = sc.nextLine().toUpperCase();

        faculty.setName(facultyName);
        faculty.setNumberOfStudents(studentCount);
        faculty.setSeason(Season.valueOf(seasonInput));

        input(faculty);


    }

}
