package com.softserve.academy.homework_07.VehicleHierarchy;

public class Helicopter extends FlyingVehicle{
   private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly(){
        System.out.println("Helicopter: is flying");
    }

    @Override
    public void land(){
        System.out.println("Helicopter: is landing");
    }
}
