/*
 * in object-oriented programming where a subclass provides its own implementation of a 
 * method that is already defined in its superclass. 
 * It allows a subclass to modify or extend the behavior of an inherited method.
 */


package com.DemoInheritance;

class A{
	
	public void show() {
	System.out.println("in A Show");
	}
	
	public void express() {
		System.out.println("in  A express");
	
	}
}	

class B extends A{
	public void show() {
		System.out.println("in B Show"); //overriding happening

	}
}

public class DemoMetOR {
	
	public static void main(String[] args) {
	
	B br=new B();
	
	br.show();

}
}
