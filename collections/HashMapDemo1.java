package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {

		HashMap<Integer, Employee> hmap = new HashMap<Integer, Employee>();

		/* Adding elements to HashMap */
		hmap.put(12, new Employee(12, "Siva", 1300L));
		hmap.put(2, new Employee(2, "Ravi", 1300L));
		hmap.put(1, new Employee(1, "Alex", 1300L));

		/* Display content using Iterator */
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		/* Get values based on key */
		Employee emp = hmap.get(2);
		System.out.println("Employee at index 2 is: " + emp);

	}
}
