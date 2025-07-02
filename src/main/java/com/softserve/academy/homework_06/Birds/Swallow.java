package com.softserve.academy.homework_06.Birds;

public class Swallow extends FlyingBird{
    public Swallow() {
        super("black and white", true);
    }
    @Override
    public void printBirdInfo() {
        System.out.println("This is a Swallow.");
        super.printBirdInfo();
    }
}
