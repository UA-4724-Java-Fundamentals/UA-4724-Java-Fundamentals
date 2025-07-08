package com.softserve.academy.homework_09;

public class PersonApp {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Jack", "White");
        Student student1 = new Student(fullName1, 25, 3);

        FullName fullName2 = new FullName("Jane", "Green");
        Student student2 = new Student(fullName2, 33, 5);

        System.out.println("Student1: ");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();

        System.out.println("Student2: ");
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();

        Student student3 = new Student(student1.getFullName(), student1.getAge(), student1.getCourse());
        student3.setCourse(4);

        System.out.println("\n---------------------\n");

        System.out.println("Student1 - original ");
        System.out.println(student1.info());
        System.out.println();

        System.out.println("Student2 - original, unchanged ");
        System.out.println(student2.info());
        System.out.println();

        System.out.println("Student3 - cloned from student1 ");
        System.out.println(student3.info());


    }
}
