package com.design.patterns.creational.builder;

class User {

	String firstName;
	String lastName;
	int age;
	String phone;
	String address;
	
	Long salary;

	public User(String firstName, String lastName, int age, String phone, String address,Long salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public User(String string, String string2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;	}

	public User(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public User(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	public User(String string, String string2, int i, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}

public class WithoutBuilderPattern {

	// if only firstName and lastName are mandatory and rest 3 fields are optional.
	// Problem !! We need more constructors.

	public static void main(String[] args) {

		User u1 = new User("rahul", "b", 12, "78789078707", "hhjk");
		System.out.println(u1);
		
		User u2 = new User("rahul", "b");
		
		User u3 = new User("rahul", "b",12);
		
		User u4 = new User("rahul", "b",12,"68668787");



	}

}
