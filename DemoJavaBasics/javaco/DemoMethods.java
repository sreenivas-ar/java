/*

Methods in Java are like action or behavior blocks that you can define inside a class. 
They allow you to perform specific tasks or operations on data.

A method is a block of code that performs a specific task. 
It is a way to group together related instructions so that they can be executed 
as a single unit.

It holds some behaviour(operations)

*/

package com.javaco;

class Book{
	
	public void getBook() {		
		System.out.println("Get me the book");		
	}
	public String getMebook(int cost) {
		
		return "Book Cost is 10 Rupees";		
	}
}

public class DemoMethods {

	public static void main(String[] args) {
		
		Book bo=new Book();
		
		bo.getBook();
		
		String sr=bo.getMebook(1000);
		
		System.out.println(sr);
		
	}

}
