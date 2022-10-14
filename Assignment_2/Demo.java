package com.Yash.Assignment_2;

/* Create class/interface Shape which will have only one method area. Create class 
Triangle, Sphere and Circle all will extends/implements Shape. In class Triangle, 
Sphere and Circle depending upon the type of shape you have to take the input from 
the user to calculate the area of the different shape.
 */
import java.util.Scanner;

interface Shapes {
	void area(Double a,Double b);
}
class Circle implements Shapes{
	
	public void area(Double side,Double side2)
    {
        double circaarea= 3.14 * side * side;
           System.out.println("the area of circle is -:"+ circaarea);    
   }
	
}
class Triangle implements Shapes{
	public void area(Double side,Double side2)
    {
        double trarea = (side*side2)/2;
        System.out.println("The area of Triangle is -:"+trarea);  
    }
	
}
class Square implements Shapes{
	public void area(Double side,Double side2)
    {
        double sqarea=side*side;
        System.out.println("the area of square is-: "+ sqarea);    
        
    }
}
public class Demo {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side");
		 Double side=sc.nextDouble();
		 
		 System.out.println("Enter the side 2: ");
	        Double side2=sc.nextDouble();
	       
	        Circle circle = new Circle();
	        circle.area(side,side2);
	        Triangle triangle = new Triangle();
	        triangle.area(side,side2);
	        
	        Square square = new Square();
	        square.area(side,side2);
	

	}

}

