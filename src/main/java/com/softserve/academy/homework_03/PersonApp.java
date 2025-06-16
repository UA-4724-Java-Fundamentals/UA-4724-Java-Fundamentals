package com.softserve.academy.homework_03;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println("--- Enter initial information for person 1 ---");
        person1.input();

        System.out.println("\n--- Initial Information ---");
        person1.output();

        person1.changeName("Ivan", "Franko");
        System.out.println("--- Information after changing name ---");
        person1.output();

        System.out.println("--- Enter information for person 2 ---");
        person2.input();

        System.out.println("--- Enter information for person 3 ---");
        person3.input();

        System.out.println("--- Enter information for person 4 ---");
        person4.input();

        System.out.println("--- Enter information for person 5 ---");
        person5.input();

        System.out.println("\n--- Final Output Information ---");
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        scanner.close();
    }

}
