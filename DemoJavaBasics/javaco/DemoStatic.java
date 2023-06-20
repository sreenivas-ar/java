/*
Static Variables:
Static varable actually shared by different objects and also we can call it by class as well
A static variable, also known as a class variable, is shared among all instances of the class.
It is declared with the static keyword and exists independently of any specific 
instance of the class.
 */

package com.javaco;

class Mobile{
	static int price;
	String brand;
	
	public void pull() {
		System.out.println(price);
	}
}

public class DemoStatic {

	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		Mobile.price=1000;
		mob.brand="apple";
		
		Mobile mob1=new Mobile();
		mob1.brand="Samsung";
		Mobile.price=400;
		
		mob.pull();
		mob1.pull();
	}
}
