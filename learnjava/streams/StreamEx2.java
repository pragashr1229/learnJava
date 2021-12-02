package com.learnjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx2 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		// Terminal operations - Terminal operations return a result of a certain type
		// after processing all the stream elements.

		// Stream.forEach()

		memberNames.forEach(System.out::println);

		// Stream.collect() - The collect() method is used to receive elements from a
		// steam and store them in a collection.

		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(memNamesInUppercase);

		// Stream.match()

		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println("anyMatch "+matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(" allMatch "+matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(" noneMatch "+matchedResult);

		// Stream.count() - terminal operation returning the number of elements in the stream as a long value.

		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

		System.out.println(" totalMatched count "+totalMatched);
		
		//Stream.reduce() - method performs a reduction on the elements of the stream with the given function

		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
		
		
		
	}
}
