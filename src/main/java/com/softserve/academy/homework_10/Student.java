package com.softserve.academy.homework_10;


import java.util.Iterator;
import java.util.List;


public class Student {
    private String name;
    private String group;
    private int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }


    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", average grade=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }

    public double getAverageGrade() {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;

        }

        return (double) sum / grades.size();
    }

    public void promote() {
        this.course++;
    }

    public static void removeStudentsWithLowGrades(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if (student.getAverageGrade() < 3) {
                iterator.remove();
                System.out.println("Removed: " + student);
            } else {
                student.promote();
                System.out.println("Student " + student.getName() + " promoted to " + student.getCourse() + " course (average score: " + String.format("%.2f", student.getAverageGrade()) + ")");
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no students on this course");
        }

    }
}
