package com.java.strings;

public class Student {

	int rollno;
	String name;
	String city;

	Student(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	/*
	 * @Override public String toString() { return "Student [rollno=" + rollno +
	 * ", name=" + name + ", city=" + city + "]"; }
	 */

	public static void main(String args[]) {
		Student s1 = new Student(101, "Raj", "lucknow");
		Student s2 = new Student(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}
