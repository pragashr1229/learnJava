package com.java.strings;

public class TestStringConcatenation2 {
	public static void main(String args[]) {
		// Note: After a string literal, all the + will be treated as string
		// concatenation operator.

		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);// 80Sachin4040
	}
}
