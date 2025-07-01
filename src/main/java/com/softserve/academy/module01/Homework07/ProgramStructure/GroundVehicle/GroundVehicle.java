package com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle;
import com.softserve.academy.module01.Homework07.ProgramStructure.Vehicle;

public abstract class GroundVehicle implements Vehicle {

    public abstract void drive();

    @Override
    public void typeOfTransport() {
        System.out.println("Ground Transport");
    }

}
