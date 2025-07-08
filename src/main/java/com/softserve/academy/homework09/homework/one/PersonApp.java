package com.softserve.academy.homework09.homework.one;

public class PersonApp {
    public static void main(String[] args) {
        FullName fullName = new FullName("Ivan", "Petrenko");
        Student student1 = new Student(fullName, 20, 1);
        Student student2 = new Student(fullName, 20, 2);

        Student student3 = student1.clone();

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}

