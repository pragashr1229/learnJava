package com.learnjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
	// Stream Operations
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Intermediate Operations - Intermediate operations return the stream itself so
		// you can chain multiple methods calls in a row.

		// Stream.filter()
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		// Stream.map() - map() intermediate operation converts each element in the
		// stream into another object
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		
		
		//flatMap : operation to convert nested list List<List<Integer>> to List<Integer>.
		List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        
          
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
        

        //Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
        //After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]
         
        List<Integer> listOfAllIntegers = listOfLists.stream()
                            .flatMap(x -> x.stream())
                            .collect(Collectors.toList());
  
        System.out.println(" listOfAllIntegers "+listOfAllIntegers);
		
		
		
		// Stream.sorted()
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);


	}

}
