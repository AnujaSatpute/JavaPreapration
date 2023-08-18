package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceVowels {
	
	public static void replace(String str)
	{
		char ch[] =str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'|| ch[i] == 'o' || ch[i] == 'u'|| ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I'|| ch[i] == 'O' || ch[i] == 'U' )
			{
				ch[i] = '$';
			}
		}
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str= sc.nextLine();
		replace(str);
	}

}
