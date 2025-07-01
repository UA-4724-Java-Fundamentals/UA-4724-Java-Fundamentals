package com.softserve.academy.module01.Homework07.ProgramStructure.WaterVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Vehicle;

public abstract class WaterVehicle implements Vehicle {

    public abstract void isSailing();

    @Override
    public void typeOfTransport() {
        System.out.println("Water Transport");
    }

}
