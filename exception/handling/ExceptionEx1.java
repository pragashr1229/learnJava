package com.java.exception.handling;

public class ExceptionEx1 {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		try {
			// code that may raise exception
			int data = 100 / 0;
			
			System.out.println("rest of the code in try ");
			System.out.println("rest of the code in try ");
			System.out.println("rest of the code in try ");
			System.out.println("rest of the code in try ");
			System.out.println("rest of the code in try ");
			System.out.println("rest of the code in try ");


		} catch (ArithmeticException e) {
			System.out.println(e);
		} 
		finally {
			System.out.println("rest of the code from finally...");
			
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}

}