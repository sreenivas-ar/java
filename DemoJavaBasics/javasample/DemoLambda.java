package com.javasample;

@FunctionalInterface
interface Laptop{
	
	public void show();
}

public class DemoLambda {

	public static void main(String[] args) {

//		Laptop lp=new Laptop()
//		{
//			public void show(){
//			System.out.println("in the DemoLambda");
//			}
//		};
		
		Laptop lp=()->System.out.println("IN THE lAMBDA");
		
		lp.show();
	}

}
