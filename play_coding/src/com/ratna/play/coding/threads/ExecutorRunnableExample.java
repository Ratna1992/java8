package com.ratna.play.coding.threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import com.ratna.play.model.Employee;

public class ExecutorRunnableExample {
	static List<Employee> listExpecting = null;

	public static void main(String[] args) {

		// creating executor service
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// runnable to execute the task
		Runnable task = () -> {
			listExpecting = EmployeeService.getEmployees();
		};

		// executing the task of runnable
		Future<?> submit = executorService.submit(task);

		// getting response from future
		try {
			submit.get();
			listExpecting.stream().filter(emp -> emp.getSalary() > 150000d).collect(Collectors.toList())
					.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
	}

}
