package com.softserve.academy.homework03;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonApp {

    static class Person {
        private String firstName;
        private String lastName;
        private int birthYear;

        public Person() {
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getAge() {
            int currentYear = LocalDate.now().getYear();
            return currentYear - birthYear;
        }

        public void input(Scanner scanner) {
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine().trim();

            System.out.print("Enter last name: ");
            lastName = scanner.nextLine().trim();

            while (true) {
                System.out.print("Enter birth year (e.g. 1990): ");
                String input = scanner.nextLine().trim();
                try {
                    int year = Integer.parseInt(input);
                    int currentYear = LocalDate.now().getYear();
                    if (year > 1900 && year <= currentYear) {
                        birthYear = year;
                        break;
                    } else {
                        System.out.println("Please enter a valid birth year between 1901 and " + currentYear);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format, please try again.");
                }
            }
        }

        public void output() {
            System.out.printf("Name: %s %s, Birth Year: %d, Age: %d%n",
                    firstName, lastName, birthYear, getAge());
        }

        public void changeName(String fn, String ln) {
            if (fn != null && !fn.isBlank()) {
                this.firstName = fn;
            }
            if (ln != null && !ln.isBlank()) {
                this.lastName = ln;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int personCount = 5;
        Person[] persons = new Person[personCount];

        System.out.println("=== Person Information Input ===");
        for (int i = 0; i < personCount; i++) {
            System.out.printf("Enter details for person #%d:%n", i + 1);
            persons[i] = new Person();
            persons[i].input(scanner);
            System.out.println();
        }

        System.out.println("--- Persons Entered ---");
        for (Person p : persons) {
            p.output();
        }

        scanner.close();
    }
}