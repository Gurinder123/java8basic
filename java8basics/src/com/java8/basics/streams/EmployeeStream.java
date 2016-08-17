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
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static List<Employee> employeeFactory() {
        return new ArrayList<Employee>() {{
            add(new Employee("Rohan", 1));
            add(new Employee("Rohit", 4));
            add(new Employee("Gurinder", 3));
            add(new Employee("Gaurav", 2));
            add(new Employee("Saurov", 6));
            add(new Employee("Baloo", 5));
            add(new Employee("Gurinder", 7));
        }};
    }
}

public class EmployeeStream {
    public static void main(String[] args) {

        List<Employee> employeeList = Employee.employeeFactory();
        // Easy sorting with lambda
        Collections.sort(employeeList, (a, b) -> a.id - b.id);
        // Check any name exist or not
        boolean check = employeeList.stream().anyMatch((s) -> s.getName().equals("Rohan"));
        // How many starts with G
        long count = employeeList.stream().filter((s) -> s.name.startsWith("G")).count();
        // For each loop
        employeeList.stream().forEach(System.out::println);

    }
}
