package com.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGenerics1 {
	public static void main(String args[]) {

		List list = new ArrayList();
		list.add("hello");
		list.add(1);
		list.add(234.56);

		String s =  (String)list.get(0);// typecasting
		
		// After Generics, we don't need to typecast the object.
		List<String> list1 = new ArrayList<String>();
		list1.add("hello");
		//list1.add(134);
		String s1 = list1.get(0);

	}
}
