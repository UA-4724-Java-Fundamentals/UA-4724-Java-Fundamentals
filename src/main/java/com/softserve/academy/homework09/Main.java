package com.softserve.academy.homework09;

public class Main {
    public static void main(String[] args) {
        Person.FullName name1 = new Person.FullName("Julia", "Diachenko");
        Person.FullName name2 = new Person.FullName("Ivan", "Petrenko");

        Student student1 = new Student(name1, 23, 2);
        Student student2 = new Student(name2, 19, 3);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = student1.cloneStudent();
        student3.setCourse(4);

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
