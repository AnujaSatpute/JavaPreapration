package com.string;

import java.util.Arrays;

public class SplitStringsExamples {

	public static void splitStrings(String s , int noOfChars)
	{
		int len = s.length();
		int size = len/noOfChars;
		String str[] = new String[size];
		
		int index =0;
		for(int i=0;i<len;i+=noOfChars)
		{
			str[index] =s.substring(i,i+noOfChars);
			index++;
		}
		System.out.println(Arrays.toString(str));
	}
	public static void main(String args[])
	{
		String str = "Programming";
		System.out.println(str);
		
		int noOfChars =4;
		if(str.length()%noOfChars != 0)
		{
			int n = noOfChars - (str.length()%noOfChars);
			for(int i=0;i<n;i++)
			{
				str=str.concat("#");
			}
		}
		splitStrings(str,noOfChars);
		
		
	}
}
