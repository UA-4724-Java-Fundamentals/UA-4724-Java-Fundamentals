package com.softserve.academy.module01.Homework09.PracticalTasks;

public class Main {
    public static void main(String[] args) {
        Department department1 = new Department("NBA",new Department.Address("Lviv","Naukova",12));

        Department department2=(Department)department1.clone();
        department2.adress.setCity("Kyiv");

        System.out.println(department1);
        System.out.println();
        System.out.println(department2);

    }
}
