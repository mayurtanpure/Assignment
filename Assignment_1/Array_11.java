package com.Yash.Assignment_1;

/*WAP to remove the String which is not palindrome string from the array of String.*/
import java.util.Scanner;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int sizeOfArray = in.nextInt();

		String[] list = new String[sizeOfArray];

		for (int i = 0; i < list.length; i++) 
		{
			System.out.println("Enter the name: "+(i+1));
			list[i] = in.next();
		}

		for (int i = 0; i < list.length; i++) 
		{
			if (!(isPalindrome(list[i]))) {
				list[i] = list[sizeOfArray - 1];
				sizeOfArray--;
			}
		}
		
		System.out.println("Palindrom list are : ");
		for (int i = 0; i < sizeOfArray; i++) 
		{
			System.out.print(list[i]+" ");
		}

	}

	static boolean isPalindrome(String str) 
	{
		char[] s=str.toCharArray();
		for (int i = 0; i < s.length / 2; i++) 
		{
			if (s[i] != s[s.length - i - 1]) 
			{
				//System.out.println("not palindrom : "+s);
				return false;
			}
		}
		//System.out.println("palindrom : "+s);
		return true;
	}

}
