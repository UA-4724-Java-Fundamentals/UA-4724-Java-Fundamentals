package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public class Student extends Person {

    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        setName(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.print("I am "+getName()+":");
    }

    @Override
    public String toString() {
        print();
        return "Student";
    }
}
