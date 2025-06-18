package com.softserve.academy.homework2;

public class AppPerson {
    public static void main (String ... args) {
        for (int i = 1; i <= 5; i++) {
            enterPerson(i);
       }
    }


    private static void enterPerson(int i) {
        Person person = new Person();
        System.out.println("Enter person " + i);
        person.input();
        person.output();
        System.out.println("Age of person " + i + "-" + person.getAge());
        changePerson(person);
    }


    private static void changePerson(Person p) {
        p.changeName ("Anna", "Vovk");
        System.out.println(p.toString());
    }

}
