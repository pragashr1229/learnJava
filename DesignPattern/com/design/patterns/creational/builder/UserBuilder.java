package com.design.patterns.creational.builder;


// Builder design pattern -  alternative way to construct complex objects
public class UserBuilder {
	public static void main(String[] args) {
		User1 user1 = new User1.UserBuilder("Lokesh", "Gupta").age(30).phone("1234567").address("address 1234")
				.build();

		System.out.println(user1);

		User1 user2 = new User1.UserBuilder("Jack", "Reacher").age(40).phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User1 user3 = new User1.UserBuilder("Super", "Man")
				// No age
				// No phone
				// no address
				.build();

		User1 user4 = new User1.UserBuilder("Super", "Man").age(56)
				// No age
				// No phone
				// no address
				.build();
		System.out.println(user4);

		User1 user5 = new User1.UserBuilder("Super", "Man").salary(667L)
				// No age
				// No phone
				// no address
				.build();
		System.out.println(user5);
	}
}
