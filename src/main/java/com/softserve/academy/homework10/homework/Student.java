package com.softserve.academy.homework10.homework;

public class Student {
    private String name;
    private int groupId;
    private int courseId;
    private int grade;

    public Student(String name, int groupId, int courseId, int grade) {
        this.name = name;
        this.groupId = groupId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupId=" + groupId +
                ", courseId=" + courseId +
                ", grade=" + grade +
                '}';
    }
}
