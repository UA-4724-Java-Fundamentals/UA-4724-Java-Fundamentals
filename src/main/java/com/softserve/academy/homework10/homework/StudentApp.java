package com.softserve.academy.homework10.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 1,2, 3));
        students.add(new Student("Valeriia", 1,2, 5));
        students.add(new Student("Oleksandr", 4,1, 2));
        students.add(new Student("Max", 2,3, 3));
        students.add(new Student("Oleg", 2,2, 1));

        System.out.println(students);
        removeStudentsLessThreeGrade(students);
        System.out.println(students);

        int valueOfCourse = 2;
        printStudents(students, valueOfCourse);
    }

    static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourseId() == course) {
                System.out.println("Student " + student.getName() + " has course " + course);
            }
        }
    }

    static void removeStudentsLessThreeGrade(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Students are empty");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGrade()<3) {
                students.remove(i);
            }
        }
    }
}
