package com.softserve.academy.module01.Homework07.ProgramStructure.FlyingVehicle;
import com.softserve.academy.module01.Homework07.ProgramStructure.Vehicle;

public abstract class FlyingVehicle implements Vehicle {

    public abstract void fly();
    public abstract void land();

    @Override
    public void typeOfTransport() {
        System.out.println("Flying Transport");
    }


}
