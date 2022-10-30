package com.ratna.play.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ratna.play.model.Student;

public class ComparableExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		Student s1 = new Student("ratna", 20, "CSE");
		Student s2 = new Student("ram", 21, "CSE");
		Student s3 = new Student("vamsi", 19, "CSE");
		Student s4 = new Student("mahesh", 22, "CSE");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}
