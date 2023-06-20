/*
 * this and Super Methods:

Every constructor have a method even if you don't mention it. that is super()
super means call the constructor of super classs
the super() will be default and first line of your method.

Every class in java extends Object Class when you are not mentioning extend

super() The super keyword refers to the parent object. It can be used to refer to
 the parent object's fields, methods, and constructors.

this() this will execute the constructor in the same class.
 */


package com.javaco;

class A{	
	public A() {
		System.out.println("In A");
	}
	public A(int a) {
		System.out.println("In A Para Constructor");
	}
}

class B extends A{
	
	public B() {
		super();//Default even if you are not mentioned as well
		System.out.println("in B");
	}
	
	public B(int a) {
		super(a);
		System.out.println("in Para Constructor");
	}
	 public B(int a,int b) {
		 this();
		System.out.println("In Two Para Constructor");
	 }
	
}

public class DemoThisSuper {

	public static void main(String[] args) {
		
//		B b=new B();
		B b1=new B(5);
		B b2=new B(1,2);

	}
}
