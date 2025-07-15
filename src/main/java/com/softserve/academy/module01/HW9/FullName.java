package com.softserve.academy.module01.HW9;

// створити record мені запропонуввала IDEA
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

    public abstract String activity();
}


class Student extends Person {
    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Studying";
    }
}


class Main {
    public static void main(String[] args) {
        FullName name = new FullName("John", "Doe");
        Person student = new Student(name, 20);

        System.out.println(student.info());
        System.out.println("Activity: " + student.activity());
    }
}
