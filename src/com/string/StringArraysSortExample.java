package com.string;

import java.util.Arrays;

public class StringArraysSortExample {

	public static void sortString(String arr[])
	{
		String temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length() != arr[j].length())
				{
					if(arr[i].length() > arr[j].length())
					{
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else
				{
					if(arr[i].compareTo(arr[j])>1)
					{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"Java","C","C++","SQl","Python","Angular","Devops"};
		System.out.println(Arrays.toString(str));
		sortString(str);
		System.out.println(Arrays.toString(str));
	}

}
