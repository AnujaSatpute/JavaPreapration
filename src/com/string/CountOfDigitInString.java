package com.string;

public class CountOfDigitInString {

	 public static void count(String str)
	 {
		int sum =0;
		//char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.print(str.charAt(i)+"  ");
				sum= sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println();
		System.out.println("Sum : "+sum);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str0="S485adhgaj569999";
		
		count(str0);
	}

}
