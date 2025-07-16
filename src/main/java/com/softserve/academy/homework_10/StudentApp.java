package com.softserve.academy.homework_10;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Oleksandr", "XI-12", 1, Arrays.asList(4, 5, 4, 4)));
        students.add(new Student("Oksana", "XT-11", 1, Arrays.asList(2, 2, 3, 3)));
        students.add(new Student("Sviat", "FT-32", 2, Arrays.asList(5, 4, 5, 4)));
        students.add(new Student("Mariia", "NT-21", 3, Arrays.asList(5, 4, 4, 3)));
        students.add(new Student("Stepan", "NT-21", 4, Arrays.asList(3, 2, 4, 2)));

        System.out.println("--- Initial list of students ---");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------------------------");

        System.out.println("\n--- Student processing (removal or promotion) ---");
        Student.removeStudentsWithLowGrades(students);
        System.out.println("----------------------------------------------------------");


        Student.printStudents(students, 1);
        Student.printStudents(students, 2);
        Student.printStudents(students, 3);
        Student.printStudents(students, 4);
        Student.printStudents(students, 5);
    }
}
