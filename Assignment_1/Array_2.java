package com.Yash.Assignment_1;
/*WAP to remove duplicate numbers from list of numbers.*/
import java.util.Scanner;

public class Array_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int size=sc.nextInt();
       System.out.println("Enter the Array element");
       int array[]=new int[10];
    for(int i=0;i<size;i++)
    {
	array[i]=sc.nextInt();
     }
    for(int i=0;i<size;i++)
    {
    for(int j=i+1;j<size;j++)	
    {
	if(array[i]==array[j])
	{
		System.out.println("Duplicate number is"+array[i]);
	}
    }
    }
    
		
    
    
	}

}
