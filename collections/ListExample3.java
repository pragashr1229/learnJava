package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "Rahul", 10000L));
		empList.add(new Employee(101, "Rakesh", 10000L));
		empList.add(new Employee(102, "Praveen", 10000L));

		Employee e = new Employee();
		e.setEmployeeId(103);
		e.setEmployeeName("Pradeep");
		e.setSalary(20000L);

		Employee e1 = new Employee();
		e1.setEmployeeId(104);
		e1.setEmployeeName("Ramesh");
		e1.setSalary(20000L);

		empList.add(e);
		empList.add(e1);

		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
		
		empList.remove(0);
		System.out.println("----Employee Object After removing----");
		for (Employee emp : empList) {
			System.out.println(emp.toString());
		}
		
		System.out.println(" whether the employee list contains e1 object "+empList.contains(e1));
		
		
	}

}
