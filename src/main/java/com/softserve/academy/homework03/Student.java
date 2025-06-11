package com.softserve.academy.homework03;

public class Student {

    public static void main(String[] args) {
        Student st1 = new Student("Alex", 9.6);
        Student st2 = new Student("Vlad", 8.4);
        Student st3 = new Student("Max", 7.2);

        System.out.println(Student.avgRating());
        System.out.println(st1.betterStudent(st2));
        System.out.println(Student.totalStudents);
        System.out.println(st3);
    }

    private String name;
    private double rating;

    public static int totalStudents = 0;
    public static double totalRating = 0;

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
        totalRating += rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double avgRating() {
        return totalRating / totalStudents;
    }

    public boolean betterStudent(Student s) {
        return this.rating > s.rating;
    }

    @Override
    public String toString() {
        return "Student name " + this.name + " ,rating " + this.rating;
    }
}
