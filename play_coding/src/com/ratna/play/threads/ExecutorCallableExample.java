package com.ratna.play.threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.ratna.play.model.Employee;

public class ExecutorCallableExample {

	public static void main(String[] args) {

		// creating executor service
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// executing required service using callable
		Callable<List<Employee>> list = () -> EmployeeService.getEmployees();

		// getting future object
		Future<List<Employee>> future = executorService.submit(list);

		// getting response from future
		try {
			List<Employee> list2 = future.get();
			list2.stream().filter(emp -> emp.getSalary() > 150000d).collect(Collectors.toList())
					.forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			executorService.shutdown();
		}
	}

}
