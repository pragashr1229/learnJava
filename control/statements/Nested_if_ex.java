package com.java.control.statements;

public class Nested_if_ex {
	public static void main(String[] args) {
		String address = "Delhi, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				
				String[] addressarray = address.split(",");
				System.out.println(addressarray[0] + " "+addressarray[1]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}
}
