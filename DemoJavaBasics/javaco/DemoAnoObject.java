package com.javaco;

/*
 * An anonymous object in Java refers to an object that is created 
 * without assigning it to a variable. 
 * 
It is typically used for short-lived instances that are used only once and 
do not require a reference for further use. 
 */

class C{
	
	public C(){
		System.out.println("In a Constructor...Object Creation");
	}
	public void show() {
		System.out.println("In a Show");
	}
}

public class DemoAnoObject {

	public static void main(String[] args) {
		
		//C obj=new C(); // C obj is the reference creation/variable and new C() is the object creation.
		
		//obj.show();
		
		new C(); //Ananomous Object
		new C().show();
			

	}

}
