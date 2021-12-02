package com.learnjava.methodreferences;

public class MethodReference {
	public static void getInfo(String info) {
		System.out.println(info);
	}

	public static void main(String[] args) {
		A a = (String s) -> System.out.println(s); //providing implementation of getName(String name) using Lambda Expression
		a.getName("SAM is executing");

		A a1 = MethodReference::getInfo; // Method reference, we have just referred the similar already existing static method getInfo(int x) of class.
		a1.getName("getInfo() of Test class is executing");
	}
}