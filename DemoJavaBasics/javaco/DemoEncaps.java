/*
 * the bundling of data (variables) and code (methods) that operate on that data 
   within a single unit
the data members name and age are declared as private. This means that they cannot be accessed directly 
from other classes. 
Instead, they must be accessed through the getter and setter methods. 
The getter methods return the value of the data members, while the setter methods 
modify the value of the data members.
 */

package com.javaco;

class Person{
	private String name;
	private int age;
	private int weight;
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight, Person pr/*pr1*/) {
		//Human pr1=pr
		
		pr.weight=weight;
	}
	
/*	public void setWeight(int weight) {
		
		this.weight=weight; //both the are same
	}
	*/

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age=a;
	}
}

public class DemoEncaps {

	public static void main(String[] args) {
		
		Person pr=new Person();
		pr.setName("Sreeni");
		pr.setAge(12);
		pr.setWeight(80,pr);
		
		System.out.println(pr.getAge()+" "+pr.getWeight());
		

	}
}
