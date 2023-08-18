package com.string;

import java.util.Arrays;

public class ReverseString {

	public static void findReverse(String s)
	{
		String s1[] = s.split(" ");
		System.out.println(Arrays.toString(s1));
		String rev="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				rev = s1[i].charAt(j)+ rev;
				rev=rev+" ";
			}
			
			
			
		}
		System.out.println(rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "India is my country";
		findReverse(s1);
	}

}
