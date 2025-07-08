package com.softserve.academy.homework09.homework.one;

public class Student extends Person implements Cloneable {
    private int courseID;

    public Student(FullName fullName, int age, int courseID) {
        super(fullName, age);
        this.courseID = courseID;
    }

    @Override
    protected String info() {
        return super.info() + " Course ID: " + courseID;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        FullName clonedFullName = this.getFullName().clone();
        return new Student(clonedFullName, getAge(), this.courseID);
    }
}

