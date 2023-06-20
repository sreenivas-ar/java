/*Object and Class

Object have properties and Behaviour and also Identity.

Example: A car have properties like color, brand, cost and 
behaviour like acceleration,brake, start

A class is a template or blueprint from which objects are created. 
So, an object is the instance(result) of a class.
*/


package com.javaco;

class Calculator{
	
	public int add(int a,int b) {
	
		int r=a+b;
		return r;
	}
}
public class Demo {

	public static void main(String[] args) {
		
		int n1=1;
		int n2=2;
		Calculator calc=new Calculator();
		int result=calc.add(n1, n2);
		System.out.println(result);
	}
}
