package com.softserve.academy.homework11set;

import java.util.ArrayList;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Emilia", 2));
        students.add(new Student("Ivan", 1));
        students.add(new Student("Petro", 3));
        students.add(new Student("Vira", 2));
        students.add(new Student("Taras", 1));
        
        Student.printStudent(students, 2);

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
   }

}
