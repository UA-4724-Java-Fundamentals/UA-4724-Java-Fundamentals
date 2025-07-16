package com.softserve.academy.homework9clone;

public abstract class Person implements Cloneable {
    private FullName fullname;
    private int age;

    public Person(FullName fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {

    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return ("First name in Person: " + fullname.getFirstName() +
        "Last name: " + fullname.getLastName() + "Age In Person: " + age);
    }
    public abstract String activity();

    @Override
    public String toString() {
        return "Person{" +
                "fullname=" + fullname +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
