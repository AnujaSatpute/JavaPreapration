package com.oops;
//Consructor Chaining
public class Calculator {

	Calculator()
	{
		this(5);
		System.out.println("This default consructor");
	}
	Calculator(int a)
	{
		this(5,10);
		System.out.println(a);
	}
	Calculator(int a, int b)
	{
		
		System.out.println("Addition : "+(a+b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 new Calculator();
	}

}
