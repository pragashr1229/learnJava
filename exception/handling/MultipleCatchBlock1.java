package com.java.exception.handling;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			
			a[5] = 30 / 2;
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}