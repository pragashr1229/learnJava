package com.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 {
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Student1> {

	public int compare(Student1 s1, Student1 s2) {
		if (s1.rollno%100 == s2.rollno%100)
			return 0;
		else if (s1.rollno%100 == s2.rollno%100)
			return 1;
		else
			return -1;
	}
	
}

class NameComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorEx {

	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student1 st = (Student1) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println(" ");

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator itr3 = al.iterator();
		while (itr3.hasNext()) {
			Student1 st = (Student1) itr3.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
