package com.softserve.academy.module01.Homework03;

import java.time.LocalDate;
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter your last name: ");
        setLastName(sc.nextLine());
        System.out.println("Enter your birth year: ");
        setBirthYear(sc.nextInt());

    }

    public void output() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Birth Year: " + getBirthYear());
        System.out.println("Age: " + getAge() + "\n");
    }

    public void changeName(String fn, String ln) {
        System.out.println("Enter your new first name: ");
        setFirstName(fn);
        System.out.println("Enter your new last name: ");
        setLastName(ln);

    }

    public static void main(String[] args) {
        Person[] p = new Person[5];

        for (int i = 0; i < 5; i++) {
            p[i] = new Person();
            System.out.println("Enter information for person " + (i + 1) + ": ");
            p[i].input();
        }
        for (Person p1 : p) {
            p1.output();
        }

    }

}
