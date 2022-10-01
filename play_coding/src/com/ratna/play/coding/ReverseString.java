package com.ratna.play.coding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

		// using java7
		String str = "ratna";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		// using java8
		System.out.println(Stream.of(str).map(name -> new StringBuffer(str).reverse()).collect(Collectors.joining()));
	}

}
