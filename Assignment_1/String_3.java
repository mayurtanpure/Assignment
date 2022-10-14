package com.Yash.Assignment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* WAP to replace all small letter by capital and capital by small.*/
public class String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	    {
	    BufferedReader buffr=new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter a string ");
	    int a;
	    char []ca;
	    ca=new char[100];
	    int i=1;
	    a=buffr.read();
	    if(a>=65 && a<=91) a=a+32;
	    else if(a>=97 && a<=122) a=a-32;
	    ca[0]=(char)a;
	    while(buffr.ready()
	    		)
	    {
	    a=buffr.read();
	    if(a>=65 && a<=91) a=a+32;
	    else if(a>=97 && a<=122) a=a-32;
	    ca[i]=(char)a;
	    i++;
	    }
	    for(int ii=0;ii<100;ii++) System.out.print((char)ca[ii]);
	    }catch(IOException io)
	    {
	    System.out.println(io);
	    }

	}

}
