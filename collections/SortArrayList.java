package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String args[]){  

		  //Creating a list of numbers  
		  List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(21);  
		  list2.add(14);  
		  list2.add(53);  
		  
		  list2.add(1);  
		  //Sorting the list  
		  Collections.sort(list2);  
		   //Traversing list through the for-each loop  
		  for(Integer number:list2)  
		    System.out.println(number);  
		 }  
		   
}
