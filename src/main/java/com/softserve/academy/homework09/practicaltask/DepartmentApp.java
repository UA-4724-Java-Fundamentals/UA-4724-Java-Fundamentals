package com.softserve.academy.homework09.practicaltask;

public class DepartmentApp {
    public static void main(String[] args) {
        Department dep1 = new Department("IT Department", "Kyiv", "Khreshchatyk", 10);
        try {
            Department dep2 = dep1.clone();
            dep2.setCity("Lviv");
            System.out.println(dep1);
            System.out.println(dep2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
