package com.softserve.academy.homework_06.Birds;

public class Penguin extends NonFlyingBird{
    public Penguin() {
        super("black and white", true);
    }
    @Override
    public void printBirdInfo() {
        System.out.println("This is a Penguin.");
        super.printBirdInfo();
    }
}
