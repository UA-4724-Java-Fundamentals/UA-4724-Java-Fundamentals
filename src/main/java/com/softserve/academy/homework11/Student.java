package com.softserve.academy.homework11;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void printStudents(List<Student> studentList, int course) {
        for (Student student : studentList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " has course: " + student.getCourse());
            }
        }
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

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", 5));
        students.add(new Student("Alex", 3));
        students.add(new Student("Valeriia", 4));
        students.add(new Student("Vitalii", 1));
        students.add(new Student("Max", 3));
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getCourse));
        System.out.println(students);
    }
}
