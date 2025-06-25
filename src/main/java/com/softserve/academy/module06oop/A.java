package com.softserve.academy.module06oop;

public class A {

    private int i = 123;

    public A() {
        System.out.println("Constructor A() done");
    }

    public A(int i) {
        System.out.println("Constructor A(int i) done");
        this.i = i;
    }

    public int getI() {
        System.out.println("\tpublic int getI() done");
        return i;
    }

    public void m1() {
        System.out.println("\tpublic void m1() from *** A *** done");
    }
}
