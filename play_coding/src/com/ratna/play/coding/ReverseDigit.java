package com.ratna.play.coding;

import java.util.stream.Stream;

public class ReverseDigit {

	public static void main(String[] args) {
		int number = 19789, last_digit, result = 0;
		while (number != 0) {
			last_digit = number % 10;
			number = number / 10;
			result = result * 10 + last_digit;
		}
		System.out.println(result);
		number = 123;
		Stream<Integer> of = Stream.of(number);
		StringBuffer stringBuffer = of.map(s -> new StringBuffer(s.toString()).reverse()).findAny().get();
		System.out.println(stringBuffer.toString());
	}

}
