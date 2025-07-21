package com.softserve.academy.module13lambda;

interface Vehicle1 {
    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }

    default void print() {
        System.out.println("I am a vehicle!");
    }

}

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle1, FourWheeler {
    public void print() {
        FourWheeler.super.print();
    }
}


public class Appl implements Vehicle1 {

    public void my() {
        //Vehicle1.super.print();
        print();
    }

    public static void main(String[] args) {
        Vehicle1.blowHorn();
        new Appl().my();
        //
        new Car().print();
    }
}
 