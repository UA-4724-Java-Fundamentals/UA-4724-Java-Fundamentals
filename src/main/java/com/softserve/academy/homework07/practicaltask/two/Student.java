package com.softserve.academy.homework07.practicaltask.two;

public class Student extends Person {
    public final static String TYPE_PERSON = "STUDENT";

    public Student() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I'm a " + getClass().getSimpleName());
    }
}
