package com.oops;

class Car
{
    int price;
    String color;
    String name;
    
    Car(int price , String name, String color)
    {
    	this.price =price;
    	this.name=name;
    	this.color =color;
    }
    public String toString()
    {
    	return price+" "+name+" "+color;
    }
}
class Baleno extends Car
{ 
	String company;
//	int price ;
//	String name,color; 
	Baleno(int price ,String name,String color ,String company){
		super(price,name,color);
		this.company = company;
	}
	public String toString()
    {
    	return price+" "+name+" "+color+" "+company;
    }
}
public class SuperAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car(150000,"Alto800","Maruti");
		System.out.println(c1);
		
		Baleno obj = new Baleno(120000,"Baleno1","Black","MArutiSuzuki");
		System.out.println(obj);
		Baleno obj1 = new Baleno(250000,"Baleno2","Blue","MArutiSuzuki");
		System.out.println(obj1);
	}

}
