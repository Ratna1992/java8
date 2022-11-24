package com.ratna.play.coding.inheritence;

import java.util.List;

public class University {

	private final List<College> colleges;

	public University(List<College> colleges) {
		super();
		this.colleges = colleges;
	}

	public List<College> getColleges() {
		return colleges;
	}

}
