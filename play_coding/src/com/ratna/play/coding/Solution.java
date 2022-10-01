package com.ratna.play.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	static String s = "";

	public static int solution(int[] A) {
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

		list.forEach(e -> {
			s = s + e;
		});

		String req = "";

		for (int i = 0; i < list.size(); i++) {
			req = req + "10";
		}
		String reqPattern = (req.substring(0, s.length()));
		int differedBy = 1;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == reqPattern.charAt(i)) {

			} else {
				differedBy = Integer.parseInt(s.charAt(i) + "");
			}

		}

		return differedBy;
	}

	public static void main(String[] args) {

		int c[] = { 0, 0, 1, 0, 1 };
		System.out.println(solution(c));

	}

}
