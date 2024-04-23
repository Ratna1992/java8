package com.ratna.play.collectors;

import com.ratna.play.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicConversions {
    public static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 15000.00, 190),
            new Employee("Tom Jones", 45, 7000.00, 220), new Employee("Ethan Hardy", 65, 8000.00, 1008),
            new Employee("Nancy Smith", 22, 10000.00, 5), new Employee("Deborah Sprightly", 29, 9000.00, 45));

    public static void main(String[] args) {

        //converting to list of names
        List<String> nameList = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        nameList.forEach(System.out::println);

        //converting to set of employees
        Set<Employee> collect = employeeList.stream().collect(Collectors.toSet());
        collect.forEach(System.out::println);

        //converting to map of employees;
        Map<Integer, Employee> map = employeeList.stream().collect(Collectors.toMap(Employee::getAge, Function.identity(),(oldValue,newValue)->newValue));
        map.entrySet().forEach((entry)->System.out.println(entry.getKey() + ":::" +entry.getValue()));

    }
}
