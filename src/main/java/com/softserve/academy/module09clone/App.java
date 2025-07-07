package com.softserve.academy.module09clone;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		Person person1 = new Person("Mike", "Green", 25);
		System.out.println("1. person1 = " + person1);
		//Person person2 = person1;
		Person person2 = new Person(person1); // Constructor of Copy
		person2.setAge(45);
		System.out.println("2. person1 = " + person1);
		System.out.println("3. person2 = " + person2);
		*/
		// /*
		Person person1 = new Person("Mike", "Green", 25);
		System.out.println("1. person1 = " + person1);
		Person person2 = (Person) person1.clone();
		System.out.println("1. person2 = " + person2);
		//
		person1.setAge(30);
		person1.getFullName().setFirstName("Michael");
		System.out.println("2. person1 = " + person1);
		System.out.println("2. person2 = " + person2);
	    // */
	}

} 