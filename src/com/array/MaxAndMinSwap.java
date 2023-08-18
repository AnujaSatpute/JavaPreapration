package com.array;

import java.util.Arrays;

public class MaxAndMinSwap {
	
	static void maxAndMin(int arr[]) {

		int max = arr[0];
		int min = arr[0];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i] < min) {
				min = arr[i];
			}
	
		}
		System.out.println("Max number of array is : " + max + "\n" + "Min number of array is : " + min);

		/*
		 * for(int i=0;i<arr.length;i++) { if(arr[i] == max || arr[i]== min) { temp =
		 * arr[min]; arr[min] = arr[max]; arr[max]=temp; }
		 * //System.out.println(Arrays.toString(arr)); }
		 */
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 7, 8, 9 ,10,2};
		maxAndMin(arr);
	}

}
