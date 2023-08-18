package classpractice;

import java.util.Arrays;

public class ArraySorting {
	
	static void sortOrder(int arr[])
	{
		int n = arr.length;
		int mid = arr.length/2;
		int temp;
		System.out.println(Arrays.toString(arr));
		for(int i=0 ;i<mid;i++)
		{
			for(int j =0;j<mid-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				   temp =arr[j]	;
				   arr[j] = arr[j+1];
				   arr[j+1] =temp;
				}
			}
		}
		for(int i=mid;i<n-1;i++)
		{
			for(int j=mid;j<n-i+mid-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					 temp = arr[j];
					 arr[j]= arr[j+1];
					 arr[j+1]=temp;
					
				}
			}
		}
		for(int i=mid;i<n-1;i++)
		{
			for(int j=mid;j<n-i+mid-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					 temp = arr[j];
					 arr[j]= arr[j+1];
					 arr[j+1]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {1,6,7,3,4,5,9,10};
		 sortOrder(arr);
	}

}
