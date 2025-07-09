package com.softserve.academy.module10box;

import java.io.Serializable;

public class BoxGen<T> { // Object by default
//public class BoxGen<T extends Serializable> {
	//private static T obj0; // Compile Error
	private T obj;
	
//	public BoxGen() {
//		obj = new T(); // Compile Error
//	}

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

//    public static T todo() { // Compile Error
//		return null;
//    }
}
     