
package com.softserve.academy.module07vehicle;

import com.softserve.academy.module06oop.B;

public class AppVehicle {

    public static void main(String[] args) {
        Vehicle[] vehicles = { new Boat(), new Plane(), new Car() };
        //
        for (Vehicle current : vehicles) {
            current.drive();
        }
    }
}
