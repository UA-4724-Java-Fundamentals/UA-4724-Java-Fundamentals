package com.softserve.academy.homework_09;

public class Student extends Person{
    private int course;


    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info(){
        return super.info() + ", "
                + "Course: " + course;

    }
    @Override
    public String activity(){
        return ("I study at university");
    }
}
