package com.ratna.play.threads;

import java.util.ArrayList;
import java.util.List;

import com.ratna.play.model.Employee;

public class EmployeeService {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee1 = new Employee("ratna", 30, 1719420d, 10);
		Employee employee2 = new Employee("rana", 18, 171940d, 10);
		Employee employee3 = new Employee("rama", 36, 171920d, 10);
		Employee employee4 = new Employee("ramu", 23, 119420d, 10);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		return employees;
	}
}
