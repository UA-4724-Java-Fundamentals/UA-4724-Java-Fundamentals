package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public class Teacher extends Staff {

    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        setName(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Teacher salary:10000");
    }

}
