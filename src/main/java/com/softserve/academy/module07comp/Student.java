package com.softserve.academy.module07comp;

import java.io.Serializable;
import java.util.Comparator;

public class Student implements Comparable<Student> {

    public static class ByDestName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return -st1.getName().compareTo(st2.getName());
        }
    }

    public class ByAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getAge() - st2.getAge();
        }
    }

    public static class ByNameAndAge implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getAge() - st2.getAge() : byName;
        }
    }

    // ----------------------------------------------------------------

    private String name;
    private int age;

    public Student() {
        name = "";
        age =  0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n\tStudent{" +
                "name = " + name +
                ",  age=" + age +
                '}';
    }

    // /*
    @Override
    public int compareTo(Student student) { // Default Sort
        return getName().compareTo(student.getName());
        //return -age + student.getAge();
        //return age - student.getAge();
    }
    // */
    //
    /*
    public int compareTo(Object student) { // Default Sort
        //return name.compareTo(((Student) student).getName());
        // return -age + student.getAge();
        //System.out.print(".");
        return age - ((Student) student).getAge();
    }
    */
}
