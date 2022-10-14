package com.Yash.Assignment_1;

import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		//Accepting the string from user
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the inputstring1");
		String inputstring1=sc.nextLine();
		
		System.out.println("enter the inputstring2");
		String inputstring2=sc.nextLine();
		
		//find string by using custom methoed
	int len1=Customstringlength.myStringLength(inputstring1);
	int len2=Customstringlength.myStringLength(inputstring2);
	
	int count=0;
	if(len1<len2)
	{
		System.out.println("NOT Substring");
	}
	else 
	{
	int k=0;
	for(int i=0;i<len2;i++)
	{
         
		for(int j=k;j<len1;j++)
		{
	  
			if(Customcharatmethoed.myCharAt(i, inputstring2)==Customcharatmethoed.myCharAt(j, inputstring1))
			{
				k=j;
				count++;
				break;
			}
		}
	}
	
	if(len2==count)
	{
		System.out.println("substring");
	}
	else
	{
		System.out.println("NOT substring");
	}
	}
	
	

	}

}
