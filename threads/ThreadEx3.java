package com.java.threads;

public class ThreadEx3 {

	// threads are executing in parallel and not sequentially.
	// The JVM and/or operating system determines the order in which the threads are
	// executed.
	// This order does not have to be the same order in which they were started.
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread: " + getName() + " running");
				}
			}.start();
		}
	}
}
