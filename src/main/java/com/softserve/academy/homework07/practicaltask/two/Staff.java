package com.softserve.academy.homework07.practicaltask.two;

public abstract class Staff extends Person {
    @Override
    public void print() {
        System.out.println("I'm a " + getClass().getSimpleName());
    }

    public abstract void salary();
}
