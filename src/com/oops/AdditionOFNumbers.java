package com.oops;

public class AdditionOFNumbers {
	
	int add=0;
	AdditionOFNumbers()
	{
		this(10);
		int a=10;
		int b=20;
		System.out.println("Addition : "+(a+b));
	
	}
	AdditionOFNumbers(int a)
	{
		this(5,10);
		int b =10;
		System.out.println("Addition 1 : "+(a+b)+" "+a);
	}
	AdditionOFNumbers(int a ,int b)
	{
		System.out.println("Addition 2 : "+ a+" "+b+"\n"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdditionOFNumbers();
	}

}
