package com.softserve.academy.module01.HW11_student;

import java.util.*;

public class Student {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Студенти курса " + courseNumber + ":");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse() == courseNumber) {
                System.out.println(s.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }
}

