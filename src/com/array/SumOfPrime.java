package com.array;

import java.util.Scanner;

public class SumOfPrime {

	void checkPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many array elements you want : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		int sum=0;
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println(" " + arr[i]);
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of prime number : "+sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfPrime obj = new SumOfPrime();
		obj.checkPrime();

	}

}
