package com.ratna.play.coding;

import java.util.Arrays;

public class AnagramStringCheck {

	public static void main(String[] args) {

		String s1 = "Ratna";
		String s2 = "Trana";

		char[] charArray = s1.toLowerCase().toCharArray();
		char[] charArray2 = s2.toLowerCase().toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		System.out.println(Arrays.equals(charArray, charArray2));

	}

}
