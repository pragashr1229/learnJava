package com.java.ioStreams;

import java.io.IOException;
import java.util.Scanner;

public class StreamsEx {
	public static void main(String[] args) throws IOException {

		int length;
		int width;
		int area;

		try {
			// Create a Scanner object to read input.
			Scanner console = new Scanner(System.in);

			// Get length from the user.
			System.out.print("Enter length ");
			length = console.nextInt();

			// Get width from the user.
			System.out.print("Enter width ");
			width = console.nextInt();

			// Calculate area.
			area = length * width;

			// Display area.
			System.out.println("The area of rectangle is " + area);
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}