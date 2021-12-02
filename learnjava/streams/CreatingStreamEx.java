package com.learnjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CreatingStreamEx {

	public static void main(String[] args) {
		
		// Stream.of
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// Stream.of(array) - creating a stream from the Array

		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(p -> {
			System.out.println(p);
		});

		// List.stream() - creating a stream from the List
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream2 = list.stream();
		stream2.forEach(p -> System.out.println(p));

		// Stream.generate() or Stream.iterate() -creating a stream from generated elements

		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));

		randomNumbers.limit(20).forEach(System.out::println);
		
		//Stream of String chars or tokens
		 Stream<String> stream3 = Stream.of("A$B$C".split("\\$"));
		 stream3.forEach(p -> System.out.println(p));
		 
		 
	        
	        
	        
		
		

	}

}
