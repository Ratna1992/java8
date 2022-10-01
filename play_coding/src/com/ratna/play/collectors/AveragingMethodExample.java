package com.ratna.play.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ratna.play.model.Employee;

public class AveragingMethodExample {

	static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 15000.00, 190),
			new Employee("Tom Jones", 45, 7000.00, 220), new Employee("Ethan Hardy", 65, 8000.00, 1008),
			new Employee("Nancy Smith", 22, 10000.00, 5), new Employee("Deborah Sprightly", 29, 9000.00, 45));

	public static void main(String[] args) {

		// averaging double
		Double collect = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect);

		// averaging int
		Double collect1 = employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
		System.out.println(collect1);

		// averaging long
		Double collect2 = employeeList.stream().collect(Collectors.averagingLong(Employee::getLeaves));
		System.out.println(collect2);

	}

}
