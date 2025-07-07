package com.softserve.academy.module09inner;

import java.util.Random;

public class Person {

	//private class FullName {
	public class FullName { // Inner Class
		private String firstName;
		private String lastName;

		public FullName() {
			this.firstName = "";
			this.lastName = "";
		}

		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			// age =123;
			// System.out.println("FullName age = " + age);
			//age = age + 1;
			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
		}

	}

	// --------------------

	private FullName fullName; // has-a; Composition
	private int age;
	Object agen;

	public Person() {
		fullName = new FullName();
		age = 456;
		System.out.println("\tConstructor: public Person()");
	}

	public Person(String firsName, String lastName, int age) {
		this();
		fullName.firstName = firsName;
		fullName.lastName = lastName;
		this.age = age;
		System.out.println("\t\tConstructor: public Person(String firsName, String lastName, int age)");
	}

	@Override
	public String toString() {
		//age = age + 1;
		return "Person [fullName=" + fullName + ", age=" + age + "]";
	}

	public void run() {
		//final int bound = 100;
		int bound = 100; // effective final
		//
		class AgeGenerator {
			private String test = "_empty_";

			void setRandomAge() {
				Random random = new Random();
				// age = random.nextInt(100);
				age = random.nextInt(bound);
				// bound = 20; // Compile Error
			}

			void printRandomNumber() {
				System.out.println("Random Age: " + age + " " + test);
				System.out.println("Random bound: " + bound);
				//bound = bound +1; // Compile Error
				System.out.println("fullName: " + fullName);
			}
		}
		//
		// bound = 101; // Error in line 67 (age = random.nextInt(bound);)
		AgeGenerator ag = new AgeGenerator();
		ag.test = "_Updated_";
		ag.setRandomAge();
		ag.printRandomNumber();
		agen = ag;
	}
}            