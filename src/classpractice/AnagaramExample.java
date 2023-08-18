package classpractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagaramExample {

	public static boolean checkAnagram(String str, String str2) {
		boolean status=true;
		
		if (str.length() != str2.length())
		{
		      status = false;
		}
		else
		{
			str = str.toLowerCase();
			str2=str2.toLowerCase();
			
			System.out.println(str +"\n"+str2);
			char ch[] = str.toCharArray();
			char ch1[] = str.toCharArray();
		
			Arrays.sort(ch);
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch));
			System.out.println(Arrays.toString(ch1));
			
			if(!Arrays.equals(ch, ch1))
			{
				status=false;
			}
			
		}
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String str = sc.next();
		System.out.println("Enter the String 2 : ");
		String str2 = sc.next();
		
		if(checkAnagram(str,str2))
		{
			System.out.println("Strings are angram");
		}
		else
		{
			System.out.println("String are not angram");
		}
	}

}
