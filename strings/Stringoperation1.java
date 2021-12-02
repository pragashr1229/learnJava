package com.java.strings;

public class Stringoperation1 {

	public static void main(String ar[]) {
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

		String s1 = "  Sachin  ";
		System.out.println(s1.length());// Sachin
		System.out.println(s1.trim().length());// Sachin

		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n"));// true

		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h
		
		System.out.println(s.length());//6    

	}
}
