package com.softserve.academy.module06oop;

public class AppAB {

    public static void main(String[] args) {
        B b = new B();
        System.out.println("b.getI() = " + b.getI());
        b.m1(); // Runtime Polymorphism
        b.m1a();
        //
        A a = new A();
        // b = (B) a; // ClassCastException
        //
        a = b; // Upcasting
        b = (B) a; // Downcasting

    }
}
