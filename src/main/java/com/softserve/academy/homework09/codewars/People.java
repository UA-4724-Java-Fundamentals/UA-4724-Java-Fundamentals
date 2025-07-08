package com.softserve.academy.homework09.codewars;

public class People {
    private String name;
    private String lastName;
    private int age;
    private String city;
    private String job;
    private String GREET="hello";

    private People(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.city = builder.city;
        this.job = builder.job;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public String greet(){
        return GREET+" my name is "+name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String lastName;
        private int age;
        private String city;
        private String job;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }
}
