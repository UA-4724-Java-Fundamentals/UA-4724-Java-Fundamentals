package com.softserve.academy.homework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;

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
        System.out.println("Students enrolled in course " + courseNumber + ":");
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    @Override
    public String toString() {
        return name + " (Course " + course + ")";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alina", 2));
        students.add(new Student("Oleksandr", 1));
        students.add(new Student("Dariia", 3));
        students.add(new Student("Khrystyna", 2));
        students.add(new Student("Karina", 1));

        printStudents(students, 2);
        System.out.println();

        Collections.sort(students, Student.compareByName());
        System.out.println("Students sorted by name:");
        students.forEach(System.out::println);
        System.out.println();

        Collections.sort(students, Student.compareByCourse());
        System.out.println("Students sorted by course:");
        students.forEach(System.out::println);
    }
}

