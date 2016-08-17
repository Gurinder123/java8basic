package com.java8.basics;

@FunctionalInterface
interface bounceable {
	void bounce();
	
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		bounceable bon = () -> {
			System.out.println("This is functonal Method");
		};
		bon.bounce();
	}
}
