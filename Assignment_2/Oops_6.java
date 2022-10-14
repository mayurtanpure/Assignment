package com.Yash.Assignment_2;

import java.util.Scanner;
public class Oops_6 {
	   public static int StringCompare(String str1, String str2) {
	        int s1 = str1.length();
	        int s2 = str2.length();
	        int lmin = Math.min(s1, s2);
	        for (int i = 0; i < lmin; i++) {
	            int str1_ch = (int) str1.charAt(i);
	            int str2_ch = (int) str2.charAt(i);
	           if (str1_ch != str2_ch) {
	                return str1_ch - str2_ch;
	            }
	            if (s1 != s2) {
	                return s1 - s2;
	            }
	            else {
	                return 0;
	            }
	       }
	       return 0;
	   }
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first string --");
	        String str1 = sc.nextLine();
	        System.out.print("Enter the second string --");
	        String str2 = sc.nextLine();
	        System.out.println("Comparing " + str1 + " and " + str2 + " : " + StringCompare(str1, str2));
	   }
	}


