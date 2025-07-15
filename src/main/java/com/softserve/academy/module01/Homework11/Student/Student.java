package com.softserve.academy.module01.Homework11.Student;

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

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int n) {
        System.out.println("Students course " + n + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == n) {
                System.out.println(student.getName());
            }
        }
    }

    public static int comparebyCourseAndName(Student o1, Student o2) {
        int compare = Integer.compare(o1.getCourse(), o2.getCourse());
        return compare == 0 ? o1.getName().compareTo(o2.getName()) : compare;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
