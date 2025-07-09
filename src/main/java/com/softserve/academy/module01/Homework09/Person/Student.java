package com.softserve.academy.module01.Homework09.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + " Course: " + course;
    }

    @Override
    public String activity() {
        return "Я навчаюся в університеті";
    }

    @Override
    public Student clone() {
        FullName clonedName = new FullName(
                this.getFullName().getFirstName(),
                this.getFullName().getLastName()
        );
        return new Student(clonedName, this.getAge(), this.course);
    }
}
