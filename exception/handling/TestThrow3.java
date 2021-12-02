package com.java.exception.handling;

//class represents user-defined exception  
class divideByZeroError extends Exception {
	public divideByZeroError(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}

//Class that uses above MyException  
public class TestThrow3 {
	public static void main(String args[]) {
		try {
			// throw an object of user defined exception
			throw new divideByZeroError("This is user-defined exception");
		} catch (divideByZeroError ude) {
			System.out.println("Caught the exception "+ude);
			// Print the message from MyException object
			System.out.println(ude.getMessage());
		}
	}
}