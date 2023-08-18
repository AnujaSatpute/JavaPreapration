package com.array;

import java.util.Arrays;

// Merge the two arrays completely
public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {56,14,25,36,33,45};
		int arr2[] = {11,22,2,3,6,55,66};
		int length = arr1.length+arr2.length;
		int arr[]= new int[length];
		int pos =0;
		for(int element :arr1) {
			arr[pos] = element;
			pos++;
		}
		for(int element : arr2) {
			arr[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(arr));
	}
	}


