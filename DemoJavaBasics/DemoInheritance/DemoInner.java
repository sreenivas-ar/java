package com.DemoInheritance;

class P{
	
	public void show() {
		System.out.println("In SHow");
	}
	
	class Q{
		
		public void config() {
		System.out.println("in Config");
			
	}
}

}
public class DemoInner {

	public static void main(String[] args) {
		
		P pe=new P();
		pe.show();
		
		P.Q pe1=pe.new Q();
		
		pe1.config();
			
		}


	}
