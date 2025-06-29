package com.softserve.academy.homework07.optional.three;

/*
   In your example, I put private access identifiers, despite the fact that we have a red plus in the layout,
   if I had left them public, there would be no point in getters and setters
 */

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setPassengers(180);
        plane.setMaxDistance(5000);
        plane.fly();
        plane.land();

        Boat boat = new Boat();
        boat.setVolume(300);
        boat.setPassengers(50);
        boat.isSailing();

        Car car = new Car();
        car.setModel("Toyota");
        car.setPassengers(4);
        car.drive();
    }
}
