package com.softserve.academy.homework_11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();

        boolean found = false;
        System.out.println("Students on course " + targetCourse + ":");
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse() == targetCourse) {
                System.out.println("Name: " + s.getName() + ", Course: " + s.getCourse());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found for course " + targetCourse + ".");
        }
    }

    // Compare by name
    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    // Compare by course
    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }
    // Compare by name and course
    public static Comparator<Student> compareByNameThenCourse() {
        return Comparator
                .comparing(Student::getName)
                .thenComparing(Student::getCourse);
    }

}


