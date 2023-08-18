package classpractice;

public class PrimeNumber {

	boolean isPrime(int num)
	{
		boolean status = true;
		if(num == 0 || num == 1)
		{
			status = false;
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i == 0)
				{
					status = false;
					break;
				}
			}	
		}
		return status;
	}
	 void checkPrime()
	 {
		 boolean flag = isPrime(5);
		 if(flag == true)
		 {
			 System.out.println("Prime Number ");
		 }
		 else
			 System.out.println("Number is not a prime");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		PrimeNumber obj = new PrimeNumber();
		obj.checkPrime();
	}

}
