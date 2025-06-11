package com.softserve.academy.homework03;

import java.util.Calendar;

public class Person {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Kozynets");
        person.input("Max", "Sydor", 2001);
        person.output();
        System.out.println(person.getAge());
    }

    private String firstName;
    private String lastName;
    private int birthYear = 0;

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
        System.out.println("Name changed");
    }

    public void output() {
        System.out.println("firstName: " + this.firstName + " , lastName: " + this.lastName + ", birthYear: " + this.birthYear);
    }

    public void input(String fn, String ln, int birthYear) {
        this.setFirstName(fn);
        this.setLastName(ln);
        this.birthYear = birthYear;
        System.out.println("Name set");
    }

    public int getAge() {
        if (this.birthYear == 0) {
            System.out.println("Value not specified");
            return 0;
        }

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        return year - this.birthYear;
    }
}
