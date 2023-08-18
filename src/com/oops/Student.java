package com.oops;

import java.util.Scanner;

//write a java program to create a hit counter for counting number of students ; scName =static;

public class Student {

	static Scanner sc = new Scanner(System.in);
	int rollNumber;
	String name ;
	static String scName="STSMKP";
	Student(int rollNumber , String name,String scName)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		
	}
	public  String  toStrin()
	{
		return rollNumber+" "+name+" "+scName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rollnumber ;
		 String name ;
		 int count=0;
		 System.out.println("Enter how many students you wants: ");
		 int num= sc.nextInt();
		 for(int i=0;i<num;i++)
		 {
			  rollnumber = sc.nextInt();
		       name = sc.next();
		       Student obj = new Student(rollnumber,name ,scName);
		       System.out.println(rollnumber+" "+name+" "+scName);
		       count++;
		 }
		System.out.println("Counter hit : "+count);
		 
	}

}
