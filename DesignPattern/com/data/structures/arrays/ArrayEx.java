package com.data.structures.arrays;

import java.util.Arrays;

public class ArrayEx {
	//check if Array contains element
	public static void main(String[] args) {
		String[] fruits = new String[] { "banana", "guava", "apple", "cheeku" };
		 
		System.out.println(Arrays.asList(fruits).contains("apple")); // true
		System.out.println(Arrays.asList(fruits).indexOf("apple")); // 2
		 
		System.out.println(Arrays.asList(fruits).contains("lion")); // false
		System.out.println(Arrays.asList(fruits).indexOf("lion")); // -1
	}
}