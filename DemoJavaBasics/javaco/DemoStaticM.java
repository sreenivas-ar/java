package com.javaco;

class Bike{
	 String model;
	 int cost;
	 static String name;
	 
	 public void show() {
		 System.out.println("Non Static Method"+name);
	 }
	 
	 public static void show1(Bike bk1) {
		// System.out.println("In static Method"+name+cost);
		 
		 System.out.println("In static Method"+name+bk1.cost);
	 }
	 
	 
}

public class DemoStaticM {

	public static void main(String[] args) {
		
		Bike bk=new Bike();
		bk.model="fzs";
		bk.cost=10000;
		bk.name="Yamaha";
		
		bk.show();
		//bk.show1();
		Bike.show1(bk);
		
		

	}

}
