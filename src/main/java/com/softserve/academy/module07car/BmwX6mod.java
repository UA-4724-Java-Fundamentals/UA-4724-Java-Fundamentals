package com.softserve.academy.module07car;

public class BmwX6mod extends BmwX6 {
	
	public BmwX6mod() {
		//super(); // from BmwX6 by default
		setMaxSpeed(250);
		System.out.println("\t\tpublic BmwX6mod()");
	}

	@Override
	public void workedEngine() {
		System.out.println("\tBmwX6mod: Engine Running on Diesel.");
		System.out.println("\tBmwX6mod: Max Speed: " + getMaxSpeed());
	}

	//@Override
//	public void workedGearBox() {
//		System.out.println("BmwX6mod: Worked GearBox.");
//	}

	@Override
	public void lightsShine() {
		System.out.println("\t\t\tBmwX6mod: Xenon Headlights.");
		//super.lightsShine();
	}
}
