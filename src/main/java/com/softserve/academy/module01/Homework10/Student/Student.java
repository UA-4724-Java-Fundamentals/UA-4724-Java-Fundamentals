package com.softserve.academy.module01.Homework10.Student;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public static void deleteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            int[] grades = student.getGrades();
            int sum = 0;

            for (int grade : grades) {
                sum += grade;
            }
            double average = sum / grades.length;
            if (average < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println(course + "rd year students:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " " + student.getGroup());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", group='" + getGroup() + '\'' +
                ", course=" + getCourse() +
                '}';
    }
}
