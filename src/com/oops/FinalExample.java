package com.oops;

public class FinalExample {

	public final static void display()
	{
		System.out.println("This is final method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int age=50;
		
		// age =45;
		 System.out.println("Age : "+age);
		 display();
	}

}
