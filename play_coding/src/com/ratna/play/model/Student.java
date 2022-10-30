package com.ratna.play.model;

public class Student implements Comparable<Student> {

	private String name;
	private Integer age;
	private String dept;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(String name, Integer age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	@Override
	public int compareTo(Student s1) {
		if (age == s1.getAge()) {
			return 0;
		} else if (age < s1.getAge()) {
			return -1;
		} else {
			return 1;
		}

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}

}
