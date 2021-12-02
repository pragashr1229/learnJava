package com.java;
//Program where this keyword is not required
class Student12 {
	int rollno;
	String name;
	float fee;
	
	Student12(){
		System.out.println("Insie Student12 Constructor");
	}

	Student12(int r, String n, float f) {
		this(); //The this() constructor call should be used to reuse 
		//the constructor from the constructor. 
		//It maintains the chain between the constructors
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class TestThis1 {
	public static void main(String args[]) {
		Student12 s1 = new Student12(111, "ankit", 5000f);
		Student12 s2 = new Student12(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}
}
