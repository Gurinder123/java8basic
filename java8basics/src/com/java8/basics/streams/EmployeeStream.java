package com.java8.basics.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	String name;

	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + id;
	}
}

public class EmployeeStream {
	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();

		l.add(new Employee("Rohan", 1));
		l.add(new Employee("Rohit", 4));
		l.add(new Employee("Gurinder", 3));
		l.add(new Employee("Gaurav", 2));
		l.add(new Employee("Saurov", 6));
		l.add(new Employee("Baloo", 5));
		l.add(new Employee("Gurinder", 7));

		// Easy sorting with lambda
		Collections.sort(l, (a, b) -> a.id - b.id);

		// Check any name exist or not
		boolean check = l.stream().anyMatch((s) -> s.getName().equals("Rohan"));

		// How many starts with G
		long count = l.stream().filter((s) -> s.name.startsWith("G")).count();

		// For each loop
		l.stream().forEach(System.out::println);

	}
}
