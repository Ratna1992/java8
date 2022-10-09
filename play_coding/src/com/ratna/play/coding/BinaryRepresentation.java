package com.ratna.play.coding;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryRepresentation {

	public static int solution(int a, int b) {
		int result = a * b;
		String binaryString = Integer.toBinaryString(result);

		List<Character> collect = binaryString.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
		return collect.stream().map(x -> String.valueOf(x)).filter(k -> !k.equalsIgnoreCase("0"))
				.collect(Collectors.toList()).size();

	}

	public static void main(String[] args) {

		System.out.println(solution(3, 7));
	}

}
