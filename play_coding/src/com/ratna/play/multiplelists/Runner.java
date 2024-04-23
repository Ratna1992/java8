package com.ratna.play.multiplelists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", null),
                new Employee(102, "Bob", null),
                new Employee(103, "Charlie", null)
        );

        List<Department> departments = Arrays.asList(
                new Department(101, "IT"),
                new Department(102, "HR"),
                new Department(103, "Finance")
        );

        // Associate each employee with their corresponding department
        List<Employee> employeesWithDepartments = employees.stream()
                .map(employee -> {
                    Department department = departments.stream()
                            .filter(d -> d.getId() == employee.getId()) // Assuming department ID matches employee ID
                            .findFirst()
                            .orElse(null); // If no matching department found, set department to null
                    return new Employee(employee.getId(), employee.getName(), department);
                })
                .collect(Collectors.toList());
        // Print the list of employees with departments
        employeesWithDepartments.forEach(System.out::println);
    }
}
