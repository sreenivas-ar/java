package com.javaco;

/*
 Static Block:

Whenever you are creating object... two things will happens one is class loads and 
objects are Instantiated.... Class loads once, it will be in JVM

static block in Java is a block of code that is executed only once, 
when the class is loaded into memory. 

Static blocks are used to initialize static variables or to call static methods. 
They are also used to perform any other tasks that need to be done only once, 
when the class is loaded.

 */

class Car{
	
	String model;
	int cost;
	static String brand;
	
	static {
		brand="Tata";
		System.out.println("In Static");
	}
	public Car() {
		System.out.println("in Constructor");
		
	}
}

public class DemoStaticB {

	public static void main(String[] args) {
		
		Car cr=new Car();
		cr.model="nano";
		cr.cost=100000;
		
		Car cr2=new Car();
		
	}

}
