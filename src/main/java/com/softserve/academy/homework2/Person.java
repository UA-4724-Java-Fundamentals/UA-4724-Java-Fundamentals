package com.softserve.academy.homework2;

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
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge() {
        int age = 2025 - birthYear;
        return age;


    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        this.firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter Birth Year: ");
        this.birthYear = sc.nextInt();

    }
    public void output() {
        System.out.println(toString());

    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
