package com.softserve.academy.homework07.practicaltask.two;

public class Cleaner extends Staff {
    public final static String TYPE_PERSON = "CLEANER";

    public Cleaner() {
        System.out.println("Type of person: " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary of Cleaner - 1000");
    }
}
