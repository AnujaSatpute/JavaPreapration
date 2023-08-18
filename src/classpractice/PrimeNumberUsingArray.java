package classpractice;

import java.util.Arrays;

public class PrimeNumberUsingArray {

	boolean isPrime(int num)
	{
		boolean status = true;
		
			if(num == 0 || num == 1)
			{
				status= false;
			}
			else
			{
				for(int j=2;j<num/2;j++)
				{
					if(num%j == 0 )
					{
						status = false;
						break;
					}
				}
			}	
		
		return status;
	}
	
	void checkPrime(int arr[] )
	{
	    boolean flag;
	    int sum =0;
	    System.out.println(Arrays.toString(arr));
	    System.out.println("Prime number in the array :");
	    for(int i=0;i<arr.length;i++)
	    {
	    	flag = isPrime(arr[i]);
	    	if(flag == true)
	    	{
	    		System.out.println(arr[i]);
	    		sum=sum+arr[i];
	    	}
	    }
	    System.out.println("Sum of Prime number : "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr[] = {1,2,3,4,5,6,9,8,7,11,23,56};
		PrimeNumberUsingArray obj = new PrimeNumberUsingArray();
		obj.checkPrime(arr);
	}

}
