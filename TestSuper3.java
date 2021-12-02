package com.java;

// super is used to invoke parent class constructor.

class Animal13 {
	Animal13() {
		System.out.println("animal is created");
	}
	Animal13(String s) {
		System.out.println(s);
	}
}

class Dog13 extends Animal13 {
	Dog13() {
		super("Hello");
		System.out.println("dog is created");
	}
}

class TestSuper3 {
	public static void main(String args[]) {
		Dog13 d = new Dog13();
	}
}
