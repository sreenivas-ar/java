/*
Method overloading in Java refers to the ability to define multiple methods in a class 
 	with the same name but different parameters. 
It allows you to create methods that perform similar tasks but 
with different input arguments.
 */


package com.javaco;

class Calculator1{
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a ,int b, int c) {
		return c;
		
	}
}

public class DemoOverLoading {

	public static void main(String[] args) {
		
		Calculator1 cal=new Calculator1();
		
		double sum1=cal.add(2,3,4);
		
		int sum=cal.add(2, 3);
		
		System.out.println(sum);
		
		System.out.print(sum1);
	}

}
