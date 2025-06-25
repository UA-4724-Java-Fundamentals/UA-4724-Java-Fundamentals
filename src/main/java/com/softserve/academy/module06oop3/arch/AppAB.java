package com.softserve.academy.module06oop3.arch;

import com.softserve.academy.module06oop3.ClassA;
import com.softserve.academy.module06oop3.ClassB;

public class AppAB {

    public static void main(String[] args) {
        /*
        System.out.println("Test ClassA.");
        ClassA a;
        //...
        a = new ClassA();
        System.out.println("a.i = " + a.i);
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        a.m6(); // static running A.m6();
        // a.m8(); // invisible form package arch
        */
        // /*
        System.out.println("Test ClassB.");
        ClassA b = new ClassB(); // dependency inversion
        System.out.println("b.i = " + b.i + "  b.getI() = " + b.getI()); // b.i from A
        b.m1();
        b.m2();
        b.m3();
        b.m4();
        //b.m5(); // Compile Error
        //((ClassB) b).m5();
        if (b instanceof ClassB) {
            ((ClassB) b).m5(); // No Runtime Error
        }
        //b.m6(); // Running from ClassA; Architecture Error;
        ClassB.m6();
        //ClassA.m6();
        //((ClassB) b).m8();
        // */
        /*
        System.out.println("Test_0 ClassB.");
        ClassB b0 = new ClassB();
        System.out.println("b0.i = " + b0.i); // from B
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
        b0.m5();
        b0.m6(); // from B
        b0.m8();
        */
    }
}
           