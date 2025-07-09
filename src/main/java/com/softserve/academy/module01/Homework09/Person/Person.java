package com.softserve.academy.module01.Homework09.Person;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName()
                + ", Last name: " + fullName.getLastName()
                + ", Age: " + getAge();
    }

    public abstract String activity();
}
