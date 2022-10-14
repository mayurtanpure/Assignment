package com.Yash.Assignment_2;

/* Create a class Area in which user will be asked to input the sides of shape. User will 
be asked to input three sides of shape. If user input two sides of shape same, you have 
to print area of square for that side. With 3 inputs you have to print area of rectangle 
in combination. With 3 sides you have to print the area of triangle. Also check the 
given three sides are belong to right angle triangle or not
*/
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape  1)circle 2)square 3)Triangle");
		int side=sc.nextInt();
		if(side==1)
		{   Scanner ci=new Scanner(System.in);
			System.out.println("Enter the radious");
			double radius=ci.nextDouble();
	        double cirArea = Math.PI * radius * radius;
	        System.out.println("Area of circle is  "+cirArea);
		}
 else if(side==2)
		{
			Scanner sq=new Scanner(System.in);
			System.out.println("Enter the sides of square");
			int sides=sq.nextInt();
			 int sqrArea = sides * sides;
			System.out.println("Area of square is:-"+sqrArea);
		}
		else if(side==3)
		{
			Scanner tr=new Scanner(System.in);
			System.out.println("Enter the base of triangle");
			Double base=tr.nextDouble();
			System.out.println("Enter the height of triangle");
			Double height=tr.nextDouble();
			Double Area=(base*height)/2;
			System.out.println("Area of triangle is:-"+Area);
		}

	}

}
