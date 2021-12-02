package com.java.threads;

public class ThreadEx1 implements Runnable {

	public void run() {
		System.out.println("Run method is calling ..");
	}

	public static void main(String[] args) {
		ThreadEx1 th = new ThreadEx1();

		Thread thread = new Thread(th);
		thread.start();

		Thread thread1 = new Thread(th, "My new thread-1");
		thread1.start();

		Thread thread2 = new Thread(th, "My new thread-2");
		thread2.start();

		System.out.println(" Name of thread reference " + thread.getName());
		System.out.println(" Name of thread1 reference " + thread1.getName());

	}
}
