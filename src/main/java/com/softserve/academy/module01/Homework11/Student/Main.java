package com.softserve.academy.module01.Homework11.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Smith", 2));
        students.add(new Student("Johnson", 3));
        students.add(new Student("Williams", 2));
        students.add(new Student("Brown", 1));
        students.add(new Student("Jones", 3));

        Student.printStudents(students, 2);
        students.sort(Student::comparebyCourseAndName);

        for (Student student : students) {
            System.out.println(student);
        }

    }

}
