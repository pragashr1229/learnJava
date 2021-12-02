package com.java.threads;

public class ThreadEx extends Thread {
	static ThreadEx thread = null;
	public static void main(String[] args) {
		 thread = new ThreadEx();
		try {
			thread.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name of Thread executing the Main method :: "+thread.getState());
	}

	public void run() {
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Pause a Thread

		System.out.println("Name of Thread executing the run method :: "+thread.getState());
	}
}