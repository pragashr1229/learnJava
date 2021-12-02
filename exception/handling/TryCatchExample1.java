package com.java.exception.handling;

import java.io.*;

public class TryCatchExample1 {

	public static void main(String[] args) {

		PrintWriter pw;
		try {
			pw = new PrintWriter("C://jtp11.txt"); // may throw exception
			pw.println("saved");
		}
		catch (FileNotFoundException e) {

			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace().toString());


			


		}
		System.out.println("File saved successfully");
	}
}
