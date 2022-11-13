package com.ratna.play.misc;

public class EqualsAndDoubleEqualOperator {

	public static void main(String[] args) {

		showDifference();
		showEqual();

	}

	private static void showDifference() {
		String name1 = "ratna";
		// String name2 = "ratna";
		String name2 = new String("ratna");

		// == checks if the reference to string objects are equal or not. Here, name1
		// and name2 are two different references. Hence, it returns false.
		System.out.println(name1 == name2);

		// equals() checks if the content of the string object are equal. Here, the
		// content of both the objects name1 and name2 is the same Programiz. Hence, it
		// returns true
		System.out.println(name1.equals(name2));
	}

	private static void showEqual() {
		String name2 = new String("ratna");
		String name1 = name2;

		// == checks if the reference to string objects are equal or not. Here, name1
		// and name2 are two different references. Hence, it returns false.
		System.out.println(name1 == name2);

		// equals() checks if the content of the string object are equal. Here, the
		// content of both the objects name1 and name2 is the same Programiz. Hence, it
		// returns true
		System.out.println(name1.equals(name2));
	}

}
