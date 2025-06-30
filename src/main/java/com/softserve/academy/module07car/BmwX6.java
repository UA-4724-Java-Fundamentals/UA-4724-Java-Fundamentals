package com.softserve.academy.module07car;

public class BmwX6 extends ACar {
	
	public BmwX6() {
		super(200);
		//super(); // from ACar by default
		//setMaxSpeed(200);
		System.out.println("\tpublic BmwX6()");
	}

	@Override
	public void carRides() {
		System.out.println("Car Rides");
		workedEngine();
		workedGearBox();
	}

	public void workedEngine() {
		System.out.println("\tBmwX6: Engine Running on Petrol.");
		System.out.println("\tBmwX6: Max Speed: " + getMaxSpeed());
	}

	private void workedGearBox() {
		System.out.println("\t\tBmwX6: Worked GearBox.");
	}

	public void lightsShine() {
		System.out.println("\t\t\tBmwX6: Halogen Headlights.");
	}
}
