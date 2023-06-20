/*
 * You can't create a object for abstract class but you can do reference
An abstract method is a method that is declared without any implementation. 
Abstract classes in Java implement the concept of Abstraction in Object Oriented Programming.

Hiding internal details and showing only the functionality is known as abstraction.

Abstract methods do not have a body or implementation. The implementation for the abstract
 methods is provided by the child classes which extend the abstract class.

An Abstract Class is nothing but a blueprint for the child class. Abstract classes 
justify the layout of your idea and does not really implement them.
 
Complasary that have absract class for abstract method but not compulsary to have 
abstract method in abstract class.
 */



package com.DemoInheritance;

abstract class Flight{
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic(){
		System.out.println("In Play Music");		
	}
}
	
abstract class AdFli extends Flight{
	
	public void drive() {
		System.out.println("In Drive AdFli");
	}
}

class AdvFli extends AdFli{ //Concrete class
	
	public void fly() {
		System.out.println("In Adv Fly");
	}
}
	


public class DemoAbstrac {

	public static void main(String[] args) {
		
		Flight fl=new AdvFli();
			
			fl.drive();
			fl.playMusic();
			fl.fly();
	}

}
