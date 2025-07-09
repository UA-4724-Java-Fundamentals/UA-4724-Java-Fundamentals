package com.softserve.academy.module01.Homework09.Person;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Thomas", "Edison"), 20, 2);
        Student student2 = new Student(new FullName("Anna", "Walker"), 21, 3);

        System.out.println(student1.info() + " " + student1.activity());
        System.out.println(student2.info() + " " + student2.activity());

        Student student3 = student1.clone();
        student3.setCourse(1);
        System.out.println(student3.info() + " " + student3.activity());

    }
}
