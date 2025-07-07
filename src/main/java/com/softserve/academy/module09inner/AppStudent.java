package com.softserve.academy.module09inner;

import java.util.Arrays;
import java.util.Comparator;

public class AppStudent {

    public static void main(String[] args) {
        /*
        Student student = new Student("Ostap", 22);
        //System.out.println(student);
        //
        Student student1 = new Student("Oles'", 19) {
            @Override
            public String toString() {
                return "name = " + getName() + ", age = " + getAge();
            }
        };
        //
        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);
        */
        //
        Student[] students = new Student[7];
        students[0] = new Student("Oksana", 26);
        students[1] = new Student("Bogdan", 27);
        students[2] = new Student("Orest", 24);
        students[3] = new Student("Ira", 23);
        students[4] = new Student("Yarko", 21);
        students[5] = new Student("Bogdan", 30);
        students[6] = new Student("Bogdan", 22);
        //
        System.out.println("Original Arrays: " + Arrays.toString(students));
        //
        Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student st1, Student st2) {
                        //return st1.getName().compareTo(st2.getName());
                        int byName = st1.getName().compareTo(st2.getName());
                        return byName == 0 ? st1.getAge() - st2.getAge() : byName;
                    }
                }
        );
        //
        System.out.println("Sorted Arrays: " + Arrays.toString(students));
    }
}
