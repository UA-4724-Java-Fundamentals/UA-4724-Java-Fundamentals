package com.softserve.academy.module06oop2;

import com.softserve.academy.module06oop2.arch.Parent;

public class Child extends Parent {

    //@Override
    public int f() {
        System.out.println("\tRunning f() from Child");
        return 2;
    }

    public int useF2() {
        //return useF();
		return f();
    }
} 