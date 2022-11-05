package com.ratna.play.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {

	private int id;
	private String name;
	private double age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Student(int id, String name, double age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Luxoft {

	public static List<Student> getStudents() {
		return Arrays.asList(new Student(1, "ABC", 18), new Student(2, "BCD", 18), new Student(3, "DEF", 19), null);
	}

	public static void main(String[] args) {
		List<Student> list = Optional.ofNullable(getStudents()).orElseGet(Collections::emptyList).stream()
				.filter(Objects::nonNull).collect(Collectors.toList());

		// approach1
		if (!list.isEmpty()) {
			LinkedHashMap<Double, List<Student>> collect = list.stream()
					.collect(Collectors.groupingBy(Student::getAge,
							Collectors.mapping(Function.identity(), Collectors.toList())))
					.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey,
							Entry::getValue, (oldValue, newValue) -> newValue, LinkedHashMap::new));

			System.out.println(collect);
		}

	}

}
