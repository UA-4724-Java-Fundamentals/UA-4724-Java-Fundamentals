package com.softserve.academy.homework_06.Birds;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        System.out.println("Is flying");
    }
}
