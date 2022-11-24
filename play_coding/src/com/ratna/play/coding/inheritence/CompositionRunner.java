package com.ratna.play.coding.inheritence;

import java.util.ArrayList;
import java.util.List;

public class CompositionRunner {

	public static void main(String[] args) {
		College c1 = new College("ABES Engineering College", new Address());
		College c2 = new College("AKG Engineering College", new Address());
		College c3 = new College("ACN College of Engineering & Management Sudies", new Address());
		List<College> college = new ArrayList<College>();
		college.add(c1);
		college.add(c2);
		college.add(c3);
		University university = new University(college);
		university.getColleges().stream().forEach(System.out::println);

	}

}
