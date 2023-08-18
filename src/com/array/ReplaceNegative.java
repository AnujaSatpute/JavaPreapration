package com.array;
//Replace all negative number by zero 
import java.util.Arrays;

public class ReplaceNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 int arr[] = {10,-2,-3,6,-4,-8,10,9,6};
		 for(int i =0;i<arr.length;i++)
		 {
			 if(arr[i]<0)
			 {
				 arr[i]=0;
			 }
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
