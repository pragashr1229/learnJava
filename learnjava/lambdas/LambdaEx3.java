package com.learnjava.lambdas;

public class LambdaEx3 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable ad = (a, b) -> (a + b);
		System.out.println(ad.add(10, 20));

		// Multiple parameters with data type in lambda expression
		Addable ad1 = (int a, int b) -> (a + b);
		System.out.println(ad1.add(100, 200));

		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
	}
}
