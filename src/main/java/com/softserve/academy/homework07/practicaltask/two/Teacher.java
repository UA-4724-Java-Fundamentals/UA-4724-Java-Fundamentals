package com.softserve.academy.homework07.practicaltask.two;

public class Teacher extends Staff {
    public final static String TYPE_PERSON = "TEACHER";

    public Teacher() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary of Teacher - 5000");
    }
}
