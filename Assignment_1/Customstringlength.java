package com.Yash.Assignment_1;

public class Customstringlength {
	public static int myStringLength(String inputstring)
	{

		int i=0;
		int count=0;
		int flag=0;
		while(true)
		{
			try
			{
		
			char ch=inputstring.charAt(i);
			count++;
			}
			catch (StringIndexOutOfBoundsException e) 
			{
				flag=1;
			}
			if(flag==1)
			{
			break;	
			}
			i++;
				
		}
		//lenght Without Using inbuilt methoed  
		//System.out.println(count);
		return count;
	}

}
