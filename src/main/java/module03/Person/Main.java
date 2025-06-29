package module03.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        int birthYear;
        int age;
        Person[] person = new Person[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i);
            firstName = getName("Enter your first name: ");
            lastName = getName("Enter your last name: ");
            birthYear = getYear("Enter your year of birth: ");
            BirthYear calculateAge = new BirthYear();
            age = calculateAge.age(birthYear);
            person[i] = new Person(firstName, lastName);
            System.out.println(person[i].fullName());
            System.out.println("Age: " + age);
        }

//        System.out.println(person[0].fullName());
//        System.out.println(person[1].fullName());
//        System.out.println(person[2].fullName());
//        System.out.println(person[3].fullName());
//        System.out.println(person[4].fullName());

    }

    public static String getName(String mes) {
        Scanner scannerNam = new Scanner(System.in);
        System.out.println(mes);
        return scannerNam.next();
    }

    public static int getYear(String mes) {
        Scanner scannerYear = new Scanner(System.in);
        System.out.println(mes);
        return scannerYear.nextInt();
    }

}
