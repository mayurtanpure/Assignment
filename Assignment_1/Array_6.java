package com.Yash.Assignment_1;

public class Array_6 {
	static void consecutiveAvg(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0; i + 1 < n; i++)
        {
            // average the alternate numbers
            sum = (arr[i] + arr[i + 1])/2;
            System.out.print(sum + " ");
        }
    }
     
    /*driver function to test function*/

	public static void main(String[] args) {
int arr[] = {78, 25, 90, 23, 90};
        
        int count=0;
        for(int i:arr) {
        	count++;
        }
        
        consecutiveAvg(arr, count);

	}

}
