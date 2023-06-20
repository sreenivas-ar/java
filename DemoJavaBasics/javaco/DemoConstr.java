/*
 * Constructor is a type of method it can call once your object created.
 * it doesn't have return value
 * The method name should same as class name.
 * 
 * Default constructor: If a class does not have any constructors, 
 * the Java compiler will automatically create a default constructor for the class. 
The default constructor does not take any arguments and does not initialize any fields.

Parameterized constructor: A parameterized constructor is a constructor that 
takes one or more arguments. 
The arguments are used to initialize the fields of the object that is created.
 * 
 */


package com.javaco;

class Dog{
	
	private String breed;
	private int age;
	private int cost;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public Dog(){
		cost=3000;			//Default Constructor
	}
	
	public Dog(String breed, int cost) { //Parameterized Constructor
		this.breed=breed;
		this.cost=cost;
		
	}
	
	
}

public class DemoConstr {

	public static void main(String[] args) {
		
		Dog dg=new Dog();
		
		System.out.println(dg.getBreed()+" "+dg.getAge()+" "+dg.getCost());
		
		dg.setBreed("pug");
		dg.setAge(2);
		dg.setCost(2000);
		
		System.out.println(dg.getBreed()+" "+dg.getAge()+" "+dg.getCost());
		
		
		Dog dg1=new Dog();
		
		dg1.setBreed("GermanShepard");
		
		System.out.println(dg1.getBreed()+" "+dg1.getAge()+" "+dg1.getCost());
		
		Dog dg2=new Dog("puppy",1000);
		
		System.out.println(dg2.getBreed()+" "+dg2.getAge()+" "+dg2.getCost());
		

	}

}
