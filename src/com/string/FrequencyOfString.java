package com.string;

public class FrequencyOfString {

	public static void frequency(String str) {
		String strr[] = str.split(" ");
		
		for (String s1 : strr)
		{
			System.out.println(s1);
		}
		for (int i = 0; i < strr.length; i++)
		{
			
			if(strr[i].equals("visited"))
					continue;
			int count = 1;
			for (int j = i + 1; j < strr.length; i++) 
			{
				
				if (strr[i].equalsIgnoreCase(strr[j])) 
				{
					count++;
					strr[j] ="visited";
					
				}
			}
			System.out.println(strr[i]+" : "+count);
			

		}
	}

	public static void main(String[] args) {

		 String s1 = "My wish is not your wish it is always my wish";

		frequency(s1);
	}

}
