package com.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
	 public static void main(String[] args){
		 
		 //anytime we want to do a particular job using multiple threads in parallel cores, 
		 // all we have to call parallelStream() method instead of stream() method.
		 
	        List<Integer> list = new ArrayList<Integer>();
	         for(int i = 1; i< 10; i++){
	             list.add(i);
	         }
	          
	        //Here creating a parallel stream
	         Stream<Integer> stream = list.parallelStream();  
	 
	         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
	         System.out.print(Arrays.toString(evenNumbersArr));
	     }
}
