package com.design.patterns.creational.singleton;

public final class SingletonEx {
	private static SingletonEx instance = null;

	// private constructor
	private SingletonEx() {
		System.out.println("From the Private Constructor Of SIngleTon");
	}

	public static SingletonEx getInstance() {
		if (instance == null) {
			System.out.println(" value of instance " + instance);
			synchronized (SingletonEx.class) {
				instance = new SingletonEx();
			}
		}
		return instance;
	}
}
