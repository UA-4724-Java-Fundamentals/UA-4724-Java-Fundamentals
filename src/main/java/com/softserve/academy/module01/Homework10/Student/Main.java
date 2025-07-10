package com.softserve.academy.module01.Homework10.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Alex", "KN24", 2, new int[]{10, 7, 5, 2, 6, 7, 8, 4, 9, 6}),
                        new Student("Anna", "KN24", 1, new int[]{1, 3, 4, 2, 3, 1, 3, 1, 2, 3}),
                        new Student("Maksym", "KN24", 3, new int[]{8, 8, 9, 9, 9, 7, 6, 7, 6, 7}),
                        new Student("Ira", "KN24", 2, new int[]{1, 2, 12, 12, 7, 9, 10, 4, 6, 6}),
                        new Student("Ihor", "KN24", 1, new int[]{5, 9, 7, 12, 6, 10, 8, 11, 4, 3}),
                        new Student("Olena", "KN24", 3, new int[]{2, 6, 8, 12, 7, 5, 9, 3, 10, 4})
                ));

        for (Student student : students) {
            System.out.println(student.toString());
        }

        Student.deleteStudents(students);
        System.out.println();

        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("Enter course:");
        int course = Integer.parseInt(sc.nextLine());
        Student.printStudents(students, course);
    }
}
