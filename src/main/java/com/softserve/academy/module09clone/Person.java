package com.softserve.academy.module09clone;

public class Person implements Cloneable { // extends Object
	private FullName fullName;
	private int age;

	// Default
	public Person() {
		this.fullName = new FullName("firstName", "lastName");
		age = 20;
	}

	// Init fields
	public Person(String firstName, String lastName, int age) {
		this.fullName = new FullName(firstName, lastName);
		this.age = age;
	}

	// Constructor of Copy
	public Person(Person person) {
		this.fullName = new FullName(person.getFullName().getFirstName(), person.getFullName().getLastName());
		age = person.getAge();
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [ fullName = " + fullName + ", age=" + age + " ]";
	}

	// /*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Person myClone = (Person) super.clone();
		myClone.setFullName((FullName) getFullName().clone());
		return myClone;
	}
	// */
}