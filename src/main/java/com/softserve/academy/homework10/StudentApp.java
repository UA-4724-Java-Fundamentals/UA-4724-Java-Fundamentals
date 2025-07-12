package com.softserve.academy.homework10;

import java.util.*;

public class StudentApp {

    static class Student {
        private final String name;
        private final String group;
        private int course;
        private final List<Integer> grades;

        public Student(String name, String group, int course, List<Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = new ArrayList<>(grades);
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

        public List<Integer> getGrades() {
            return grades;
        }

        public double getAverageGrade() {
            return grades.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
        }

        public boolean shouldBeRemoved() {
            return getAverageGrade() < 3.0;
        }

        public void promote() {
            this.course++;
        }

        @Override
        public String toString() {
            return String.format("%s (Group: %s, Course: %d, GPA: %.2f)",
                    name, group, course, getAverageGrade());
        }
    }

    static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.shouldBeRemoved()) {
                iterator.remove();
            } else {
                student.promote();
            }
        }
    }

    static void printStudentsInCourse(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        students.stream()
                .filter(s -> s.getCourse() == course)
                .map(Student::getName)
                .forEach(name -> System.out.println("- " + name));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Oksana", "A1", 1, List.of(4, 5, 3)),
                new Student("Andrii", "A1", 1, List.of(2, 2, 2)),
                new Student("Oleksii", "B2", 2, List.of(3, 4, 4)),
                new Student("Kateryna", "B1", 2, List.of(5, 5, 5)),
                new Student("Yevhen", "C3", 3, List.of(1, 2, 1))
        ));

        System.out.println("Original student list:");
        students.forEach(System.out::println);

        processStudents(students);

        System.out.println("\nAfter removal and promotion:");
        students.forEach(System.out::println);

        int courseToPrint = 2;
        System.out.println();
        printStudentsInCourse(students, courseToPrint);
    }
}
