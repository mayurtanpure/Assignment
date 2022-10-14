package com.Yash.Assignment_2;

public class Oops_8 {
	Oops_8()
	{
		System.out.println("Object Is Created");
	}
	
	protected void finalize()
	{
		System.out.println("Object Is Destroyed");
	}
	
	
	public static void main(String[] args) {
		Oops_8 pe = new Oops_8();
		
		System.out.println(pe.hashCode());
		pe = null;// By giving Null Refrence
		System.out.println(pe);
		Oops_8 p1 = new Oops_8();
		System.out.println(p1.hashCode());
		Oops_8 p2 = new Oops_8();
		System.out.println(p2.hashCode());
		p1 = p2; //By Assigning
		new Oops_8();//anoymonous object refrence
		System.out.println(p1.hashCode());
		//System.out.println(pe.hashCode());
		System.out.println(p2.hashCode());
		System.gc();
	}

}
