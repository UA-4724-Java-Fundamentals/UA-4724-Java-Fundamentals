package com.softserve.academy.module01.Hw9_2;

public record FullName(String firstName, String lastName) {

}

abstract class Person {
    private final FullName fullName;
    private final int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.firstName() +
                ", Last name: " + fullName.lastName() +
                ", Age: " + age;
    }
}

class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        FullName name1 = new FullName("Alice", "Smith");
        Student student1 = new Student(name1, 19, 2);

        FullName name2 = new FullName("Bob", "Johnson");
        Student student2 = new Student(name2, 20, 3);

        System.out.println(student1.info());
        System.out.println("Activity: " + student1.activity());

        System.out.println(student2.info());
        System.out.println("Activity: " + student2.activity());

        Student student3 = student1.clone();
        if (student3 != null) {
            student3.setCourse(4);
        }

        System.out.println(student3.info());
        System.out.println("Activity: " + student3.activity());
    }
}
