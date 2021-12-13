package com.design.patterns.creational.builder;

public class User1 {
	private String firstName = "";
	private String lastName = "";
	private int age = 0;
	private String phone = "";
	private String address = "";
	
	private Long salary = 0L;

	private User1(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
		this.salary = builder.salary;
	}

	// All getter, and NO setter to provde immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	

	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", salary=" + salary + "]";
	}



	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		
		private Long salary;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder salary(Long salary) {
			this.salary = salary;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		// Return the finally consrcuted User object
		public User1 build() {
			User1 user = new User1(this);
			return user;
		}

	}
}