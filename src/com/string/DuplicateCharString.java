package com.string;

public class DuplicateCharString {

	public static void duplicateChar(String str)
	{
		int count;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '\0')
				continue;
			count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && ch[j] != '\0')
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count > 1)
			{
				System.out.println(ch[i]);
			}
		}
	}
	public static void uniqueChar(String str)
	{
		int count;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '\0')
				continue;
			count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && ch[j] != '\0')
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count == 1)
			{
				System.out.println(ch[i]);
			}
		}
	}
	public static void frequencyChar(String str)
	{
		int count;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '\0')
				continue;
			count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && ch[j] != '\0')
				{
					count++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+" : "+count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 String str= "JavaProggramingLanguage";
		 //duplicateChar(str);
		 frequencyChar(str);
		 uniqueChar(str);
	}

}
