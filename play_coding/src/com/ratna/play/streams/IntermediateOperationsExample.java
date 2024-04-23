package com.ratna.play.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}

public class IntermediateOperationsExample {
    public static void main(String[] args) {

        //iterate
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);

        //flatmap
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> collect = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        List<Employee> employees1 = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "IT")
        );

        List<Employee> employees2 = Arrays.asList(
                new Employee("Charlie", "HR"),
                new Employee("David", "HR"),
                new Employee("Eve", "HR")
        );

        List<Department> departments = Arrays.asList(
                new Department("IT", employees1),
                new Department("HR", employees2)
        );

        List<Employee> collect1 = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toList());

        System.out.println(collect1);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        map2.put("D", 4);

        List<Map<String, Integer>> listOfMaps = Arrays.asList(map1, map2);
        // Flatten the values of the maps into a single stream
        List<Integer> values = listOfMaps.stream()
                .flatMap(map -> map.values().stream())
                .collect(Collectors.toList());
        System.out.println(values);




    }
}
