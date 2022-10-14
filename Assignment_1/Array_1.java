package com.Yash.Assignment_1;
/*WAP to find third minimum number from list of numbers*/
public class Array_1 {
	public static int Third(int[]a,int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[n-3];
	}

	public static void main(String[] args) {
	
 int a[]= {3,54,7,8,5,6,9};
 System.out.println(Third(a,5));

	}

}
