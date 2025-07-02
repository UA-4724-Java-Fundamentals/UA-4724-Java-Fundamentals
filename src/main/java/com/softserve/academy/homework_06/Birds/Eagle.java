package com.softserve.academy.homework_06.Birds;

public class Eagle extends FlyingBird{
    public Eagle() {
        super("brown", true);
    }
    @Override
    public void printBirdInfo() {
        System.out.println("This is an Eagle.");
        super.printBirdInfo();
    }
}

