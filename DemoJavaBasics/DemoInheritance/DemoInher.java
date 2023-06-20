package com.DemoInheritance;

// Single Level Inheritance

class Calc{
	
	public int add(int a,int b) {
		return 0;
		
	}
	
	public int sub(int a, int b) {
		return 0;
	}
	
}

class AdCalc extends Calc{
	
	 public int multi(int a, int b) {
		 return 0;
	 }
	 
	 public int divi(int a, int b) {
		 System.out.println("in Divi");
		 return 0;
	 }
	 
}

public class DemoInher {

	public static void main(String[] args) {
		
		AdCalc ca=new AdCalc();
//		VeAdCalc ca=new VeAdCalc();
		ca.divi(3,2);	
	}

}
