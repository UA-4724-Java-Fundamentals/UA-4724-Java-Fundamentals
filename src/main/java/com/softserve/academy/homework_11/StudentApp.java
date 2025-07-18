package com.softserve.academy.homework_11;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 2));
        students.add(new Student("Bohdan", 1));
        students.add(new Student("Olena", 3));
        students.add(new Student("Mykola", 1));
        students.add(new Student("Sofiia", 2));

        Student.printStudents(students, 2);

        students.sort(Student.compareByName());
        System.out.println("\nStudents sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Student.compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(Student.compareByNameThenCourse());
        System.out.println("\nStudents sorted by name and course:");
        for (Student s : students) {
            System.out.println(s);
        }
        Student.printStudents(students, 5);

    }
}
