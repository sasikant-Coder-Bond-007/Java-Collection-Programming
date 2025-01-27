package com.example;

import java.util.ArrayList;
import java.util.List;

public class Test_ArrayList_Sort {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(6l, "Alex", 25, "Developer"));
		employees.add(new Employee(8l, "Brian", 21, "Tester"));
		employees.add(new Employee(5l, "Piyush", 25, "Developer"));
		employees.add(new Employee(4l, "Charles", 35, "Manager"));
		employees.add(new Employee(3l, "Pawan", 19, "Developer"));
		employees.add(new Employee(1l, "Pankaj", 32, "Architect"));
		employees.add(new Employee(10l, "Suman", 26, "Developer"));
		employees.add(new Employee(2l, "Steve", 48, "CEO"));
		employees.add(new Employee(9l, "Mohan", 32, "Director"));
		employees.add(new Employee(7l, "Rama", 20, "Tester"));
		
		System.out.println("=============== Employees sorted by id ================");
		employees.sort(new SortEmployeesById());
		System.out.println(employees);
		
		System.out.println();
		
		System.out.println("=============== Employees sorted by names ==============");
		employees.sort(new SortEmployeesByName());
		System.out.println(employees);

	}

}
