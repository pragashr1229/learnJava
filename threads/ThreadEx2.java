package com.java.threads;

public class ThreadEx2 {
	public static void main(String[] args) {
		Thread t = new Thread("My first thread");
		t.start();
		String str = t.getName();
		System.out.println(str);
	}
}
