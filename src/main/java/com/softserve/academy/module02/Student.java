package com.softserve.academy.module02;

//public class Student extends Object {
public class Student { // extends Object by Default
    private String firstname;
    private String lasttname;
    private int age;

    private static int count = 0;

    public Student() { // Default Constructor
        firstname = "";
        lasttname = "";
        age = 0;
        count++;
    }

    public Student(String firstname) {
        this.firstname = firstname;
        lasttname = "";
        age = 0;
        count++;
    }

    public Student(String firstname, int age) {
        this.firstname = firstname;
        lasttname = "";
        this.age = age;
        count++;
    }

    public Student(String firstname, String lasttname, int age) {
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.age = age;
        count++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\tStudent{" +
                "firstname='" + firstname + '\'' +
                ", lasttname='" + lasttname + '\'' +
                ", age=" + age +
                '}';
    }
}
