package com.softserve.academy.homework_03;

import java.util.Scanner;

import java.time.Year;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;


    public Person() {
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        this.lastName = scanner.nextLine();


        System.out.print("Enter your birthYear: ");
        this.birthYear = scanner.nextInt();


    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName +
                ", Birth Year: " + birthYear +
                ", Age: " + getAge());

    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

}
