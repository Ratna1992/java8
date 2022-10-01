package com.ratna.play.model;

public class Employee {

	private String name;
	private Integer age;
	private Double salary;
	private long leaves;

	public Employee(String name, Integer age, Double salary, long leaves) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.leaves = leaves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public long getLeaves() {
		return leaves;
	}

	public void setLeaves(long leaves) {
		this.leaves = leaves;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", leaves=" + leaves + "]";
	}
	
	

}
