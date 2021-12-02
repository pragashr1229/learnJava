package com.java.exception.handling;

public class ExceptionScenarios {

	public static void main(String[] args) {

		try {
			int a1 = 50 / 0;// ArithmeticException

			String s = null;
			System.out.println(s.length());// NullPointerException

			String s1 = "abc";
			int i = Integer.parseInt(s1);// NumberFormatException

			int a[] = new int[5];
			a[10] = 50; // ArrayIndexOutOfBoundsException

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
