package com.oops;

import java.util.Scanner;

public class Triangle extends Shape {

	int h,b;
	Scanner sc = new Scanner(System.in);
	@Override
	void area() {
		System.out.println("Enter base and height : ");
	    b=sc.nextInt();
	    h=sc.nextInt();
		 int area = (int) (0.5*(b*h));
		 System.out.println("Area of Triangle : "+area);
		
	}

	@Override
	void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Enter base and side and side : ");
	    int a=sc.nextInt();
	    b=sc.nextInt();
	    int c= sc.nextInt();
	    int per=a+b+c;
	    System.out.println("Perimeter of traingle :"+per);

	}
	

}
