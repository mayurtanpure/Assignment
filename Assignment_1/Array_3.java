package com.Yash.Assignment_1;
/*WAP to create a dynamic array. Dynamic Array means when user want to input the number 
more than size of array it will increase the size of array without throwing exception.*/
public class Array_3 {

		private int array[];   
		private int count;   
		private int sizeofarray;   
		
		
		public Array_3()   
		{   
		array = new int[1];   
		count = 0;   
		sizeofarray = 1;}
		 
		public void addElement(int a)   
		{   
		
			 
		if (count == sizeofarray)   
		{   
		
			    
		growSize();   
		}   
		
		  
		array[count] = a;   
		count++;   
		}   
		
		
		public void growSize()   
		{   
		
			     
		int temp[] = null;   
		if (count == sizeofarray)   
		{   
		
			  
		temp = new int[sizeofarray * 2];   
		{   
		for (int i = 0; i < sizeofarray; i++)   
		{   
		
			  
		temp[i] = array[i];   
		}   
		}   
		}   
		array = temp;   
		sizeofarray= sizeofarray * 2;   
		}   
		
		 
		public void shrinkSize()   
		{   
		
		     
		int temp[] = null;   
		if (count > 0)   
		{   
		
			
		temp = new int[count];   
		for (int i = 0; i < count; i++)   
		{   
		
			//copies all the elements of the old array  
		temp[i] = array[i];   
		}   
		sizeofarray = count;   
		array = temp;   
		}   
		}   
		
		//creating a function that removes the last elements for the array  
		public void removeElement()   
		{   
		if (count > 0)   
		{   
		array[count - 1] = 0;   
		count--;   
		}   
		}   
		
		//creating a function that delets an element from the specified index  
		public void removeElementAt(int index)   
		{   
		if (count > 0)   
		{   
		for (int i = index; i < count - 1; i++)   
		{   
		
			//shifting all the elements to the left from the specified index  
		array[i] = array[i + 1];   
		}   
		array[count - 1] = 0;   
		count--;   
		}   
		}   
		public static void main(String[] args)   
		{   
			Array_3 da = new Array_3();   
		
			//adding elements to the array  
		da.addElement(67);   
		da.addElement(54);   
		da.addElement(35);   
		da.addElement(47);   
		da.addElement(85);   
		da.addElement(26);   
		da.addElement(70);   
		da.addElement(81);   
		da.addElement(96);   
		da.addElement(54);  
		System.out.println("Elements of the array:");   
		
		//iterate over the array for accessing the elements  
		for (int i = 0; i < da.sizeofarray; i++)   
		{   
		System.out.print(da.array[i] + " ");   
		}   
		System.out.println();   
		
		//determines and prints the size and number of elements of the array  
		System.out.println("Size of the array: " + da.sizeofarray);   
		System.out.println("No. of elements in the array: " + da.count);   
		
		//invoking the method to delete the last element of the array  
		da.removeElement();   
		
		//prints array after deleting the last element  
		System.out.print("\nElements of the array after deleting the last element: ");   
		for (int i = 0; i < da.sizeofarray; i++)  
		{   
		System.out.print(da.array[i] + " ");   
		}   
		System.out.println();   
		
		//determines and prints the size and number of elements of the array  
		System.out.println("Size of the array: " + da.sizeofarray);   
		System.out.print("No. of elements in the array: " + da.count+"\n");   
		
		//invoking the method that deletes an element from the specified index  
		da.removeElementAt(7);   
		System.out.print("\nElements of the array after deleting the element at index 7: ");   
		
		
		for (int i = 0; i < da.sizeofarray; i++)   
		{   
		System.out.print(da.array[i] + " ");   
		}   
		System.out.println();  
		
		 
		System.out.println("Size of the array: " + da.sizeofarray);   
		System.out.print("No. of elements in the array: " + da.count);  

	}

}
