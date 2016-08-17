package com.java8.basics.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class OptionalHandling {

    public static void main(String[] args) {
        List<Employee> list = Employee.employeeFactory();
        list.stream().filter(OptionalHandling::filterByRequired).
                sorted((emp1, emp2) -> emp1.getName().toLowerCase().compareTo(emp2.getName().toLowerCase())).
                forEach(employee -> System.out.println(employee.getName() + " " + (employee.getLname() == null ? " " : employee.getLname())));
    }

    private static boolean filterByRequired(Employee employee) {
        Optional<String> fName = Optional.ofNullable(employee.getName());
        Optional<String> lName = Optional.ofNullable(employee.getLname());
        Predicate<Employee> employeePredicate = emp -> fName.map(String::toLowerCase).orElse("").contains("h") || lName.map(String::toLowerCase).orElse("").contains("h");
        return employeePredicate.test(employee);
    }

}

class Department {

    public String getDeptName() {
        return deptName;
    }

    public Department(String deptName) {
        this.deptName = deptName;
    }

    private String deptName;


}

class Employee {
    private String name;
    private String lname;

    public String getLname() {
        return lname;
    }

    private Department department;

    public Department getDepartment() {
        return department;
    }


    public Employee(Department department, String name, String lname, int id) {
        this.department = department;
        this.name = name;
        this.id = id;
        this.lname = lname;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id=" + id +
                '}';
    }

    private int id;

    public static List<Employee> employeeFactory() {
        return new ArrayList<Employee>() {
            {
                add(new Employee(new Department("dept"), "Gurinder", "Singh", 1));
                add(new Employee(new Department("dept"), "Harsh", "Jain", 1));
                add(new Employee(new Department("dept"), "Hari", "Singh", 1));
                add(new Employee(new Department("dept"), "Chambu", null, 1));
                add(new Employee(new Department("dept"), "Gurpreet", "Singh", 1));
                add(new Employee(new Department("dept"), "Ramesh", "Jain", 1));
            }
        };
    }
}