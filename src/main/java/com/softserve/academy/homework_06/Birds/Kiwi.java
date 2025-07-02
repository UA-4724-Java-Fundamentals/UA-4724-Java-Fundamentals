package com.softserve.academy.homework_06.Birds;

public class Kiwi extends NonFlyingBird{
    public Kiwi() {
        super("brown", true);
    }
    @Override
    public void printBirdInfo() {
        System.out.println("This is a Kiwi.");
        super.printBirdInfo();
    }

}
