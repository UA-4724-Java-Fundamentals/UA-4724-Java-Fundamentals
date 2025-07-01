package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public abstract class Staff extends Person {

    @Override
    public void print() {
        System.out.print("I am "+getName()+":");
    }

    abstract void salary();

    @Override
    public String toString() {
        print();
        return "Staff";
    }
}
