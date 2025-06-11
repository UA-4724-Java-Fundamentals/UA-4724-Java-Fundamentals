package com.softserve.academy.module02;

class StudentDemo{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstname("Alice");
        student1.setAge(18);

        Student student2 = new Student("Bob");
        student2.setAge(22);

        Student student3 = new Student("Carla",25);
        //
        System.out.println("Counts of students is " + Student.getCount());
    }
}