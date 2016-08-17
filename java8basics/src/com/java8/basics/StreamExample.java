package com.java8.basics;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String r[]) {
		List<String> names = Arrays
				.asList("master", "anil", "kabir", "baabala");

		// Stream Example with method reference ::
		names.stream().forEach(System.out::println);

		// check wheter any word exist or not
		boolean check = names.stream().anyMatch((s) -> s.startsWith("c"));

		// How many words start with
		long count1 = names.stream().filter((s) -> s.startsWith("a")).count();

		// How many words are Exactly
		long count2 = names.stream().filter((s) -> s.startsWith("anil")).count();
		System.out.println(check);

	}
}
