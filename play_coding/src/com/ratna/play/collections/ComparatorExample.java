package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.List;

import com.ratna.play.model.Employee;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee("ratna", 30, 1719420d, 10);
		Employee employee2 = new Employee("rana", 18, 171940d, 10);
		Employee employee3 = new Employee("rama", 36, 171920d, 10);
		Employee employee4 = new Employee("ramu", 23, 119420d, 10);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		// comparing with age
		employees.sort((emp1, emp2) -> emp1.getAge().compareTo(emp2.getAge()));
		System.out.println(employees);

		// comparing with salary
		employees.sort((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));
		System.out.println(employees);

	}

}
