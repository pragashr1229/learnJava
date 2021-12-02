package com.java.threads;

public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 2; i++) {
            
			new Thread("" + i) {
				public void run() {
					System.out.println("state of a Thread before run method : " + Thread.currentThread().getState());
					try {
						Thread.sleep(2000L);
						System.out.println("state of a Thread after run method : " + Thread.currentThread().getState());

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // Pause a Thread

				}
			}.start();
		}
	}
}