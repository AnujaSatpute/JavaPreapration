package com.oops;


public abstract class Shape {

	public void draw()
	{
		System.out.println("Draw a any shape");
	}
	
	abstract void area();
	
	abstract void perimeter();
}
