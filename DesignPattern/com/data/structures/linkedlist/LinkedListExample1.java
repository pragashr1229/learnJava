package com.data.structures.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
        
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		 
		//1. LinkedList to Array
		String array[] = new String[linkedList.size()];
		linkedList.toArray(array);
		 
		System.out.println(Arrays.toString(array));
		 
		//2. Array to LinkedList
		LinkedList<String> linkedListNew = new LinkedList<>(Arrays.asList(array));
		 
		System.out.println(linkedListNew);
		
		//Unsorted
		System.out.println(" Unsorted "+linkedList);
		 
		//1. Sort the list
		Collections.sort(linkedList);
		 
		//Sorted
		System.out.println(" Sort "+linkedList);
		 
		//2. Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());
		 
		//Custom sorted
		System.out.println(" Custom "+linkedList);
	}
}
