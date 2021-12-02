package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		// HashSet declaration
		HashSet<String> hset = new HashSet<String>();

		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		// Addition of duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		// Addition of null values
		hset.add(null);
		hset.add(null);

		// Displaying HashSet elements
		System.out.println(hset);

		HashSet<Employee> empSet = new HashSet<Employee>();

		Employee e = new Employee();
		e.setEmployeeId(103);
		e.setEmployeeName("Pradeep");
		e.setSalary(20000L);

		Employee e1 = new Employee();
		e1.setEmployeeId(104);
		e1.setEmployeeName("Ramesh");
		e1.setSalary(20000L);


		empSet.add(e);
		empSet.add(e1);

		Iterator<Employee> it = empSet.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
