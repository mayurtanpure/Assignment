package com.Yash.Assignment_2;

import java.util.Scanner;

public class Oops_5 {
	
	public int maxFunction(int [] arrNum,int n)
    {    
        for(int i = 0; i <n; i++)
        {
                if(arrNum[0] < arrNum[i])
                {
                    arrNum[0] = arrNum[i];
                }
        }
        System.out.println("Maximum Number " + arrNum[0]);
        return 0;
    }
    
    public int maxFunction(String [] arrLength,int n)
    {    
    
        int maxLength = 0;
        String longestString = null;
        for(String s : arrLength)
        {
            if(s.length() > maxLength)
            {
                maxLength = s.length();
                longestString = s;
                System.out.println("Longest String :" + longestString + " Longest String Length :" + longestString.length());
            }
        }
         
        return 0;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in =new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int sizeOfArray= in.nextInt();
	        int [] array = new int [sizeOfArray];
	        for (int i = 0; i < array.length; i++)
	        {
	            System.out.println("Enter the element of the array : "+(i+1));
	            array[i]=in.nextInt();
	       }
	        
	        Oops_5 six = new Oops_5();
	        six.maxFunction(array, sizeOfArray);
	        System.out.println("");
	        
	        System.out.println("Enter the size of the array for the string:");
	        int n= in.nextInt();
	        String [] arrayString = new String [n];
	        for (int i = 0; i < n; i++)
	        {
	            System.out.println("Enter the string of the array : "+(i+1));
	            arrayString[i]=in.next();
	       }
	    
	        six.maxFunction(arrayString, n);
	    }
		
		
	}


