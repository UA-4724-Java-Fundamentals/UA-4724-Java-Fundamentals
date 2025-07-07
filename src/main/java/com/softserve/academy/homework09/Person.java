package com.softserve.academy.homework09;

public abstract class Person {
    private final FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = new FullName(fullName.getFirstName(), fullName.getLastName());
        this.age = age;
    }

    public FullName getFullName() {
        return new FullName(fullName.getFirstName(), fullName.getLastName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    public abstract String activity();

    public static class FullName {
        private final String firstName;
        private final String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
}