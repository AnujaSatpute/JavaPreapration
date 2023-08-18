package com.string;

import java.util.Scanner;

public class ExceptionCheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id : ");
		s.setId(sc.nextInt());
		
		System.out.println("Enter your name : ");
		String name =sc.next();
		
		if(name.length()<3)
		{
			throw new InvalidNameException("Name length should be greater than 2 ");
		}
		else
			s.setName(name);
		
		System.out.println("Enter your marks :");
		float marks = sc.nextFloat();
		
		if(marks <100 || marks > 0)
		{
			throw new InvalidMarksException("Marks should be in the range of 100 to 0");
		}
		else
			s.setMarks(marks);
	}

}
