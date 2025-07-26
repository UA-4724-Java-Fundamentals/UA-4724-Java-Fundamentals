package com.softserve.academy.module01.HW11_student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ганна", 2));
        students.add(new Student("Богдан", 3));
        students.add(new Student("Катерина", 2));
        students.add(new Student("Олег", 1));
        students.add(new Student("Данило", 3));

        Student.printStudents(students, 2);

        students.sort(Student.compareByName());
        System.out.println("\nСортування за ім'ям:");
        for (Student s : students) {
            System.out.println(s.getName() + " — курс " + s.getCourse());
        }

        students.sort(Student.compareByCourse());
        System.out.println("\nСортування за курсом:");
        for (Student s : students) {
            System.out.println(s.getName() + " — курс " + s.getCourse());
        }
    }
}
