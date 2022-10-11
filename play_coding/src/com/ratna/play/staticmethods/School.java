package com.ratna.play.staticmethods;

public interface School {

	static String subject(String s1) {
		return s1;
	}

	static String subject(String s1, String s2) {
		return s1 + " " + s2;
	}
}
