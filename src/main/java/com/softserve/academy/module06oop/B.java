package com.softserve.academy.module06oop;

public class B extends A {
    public int j = 456;

    public B() {
        System.out.println("Constructor B() done");
    }

    public B(int j) {
        System.out.println("Constructor B(int j) done");
        this.j = j;
    }

    @Override
    public void m1() {  // Runtime Polymorphism
        System.out.println("\tpublic void m1() from +++ B +++ done");
    }

    public void m1a() {
        super.m1();
    }
}
