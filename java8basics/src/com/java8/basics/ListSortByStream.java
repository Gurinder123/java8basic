package com.java8.basics;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortByStream {

	public static void main(String r[]) {

		List<String> names = Arrays.asList("james", "andy", "robert", "ram",
				"scott", "sunny");
		/*
		 * Legacy style to sort by comparator in alphabetical order
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}
		});
		System.out.println(names);
		/*
		 * New Java 8 sorting with Streams in reverse order
		 */

		Collections.sort(names, (String a, String b) -> b.compareTo(a)); //only one line code woooh :D \m/

		System.out.println(names);

	}
}
