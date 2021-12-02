package com.java.exception.handling;
//exception without maintaining the order of exceptions (i.e. from most specific to most general).
class MultipleCatchBlock5 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
		}
		System.out.println("rest of the code...");
	}
}
