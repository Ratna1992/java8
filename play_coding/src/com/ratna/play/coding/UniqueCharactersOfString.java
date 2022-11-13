package com.ratna.play.coding;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UniqueCharactersOfString {

	public static void main(String[] args) {
		System.out.println(UniqueCharactersOfString.checkUniqueCharacters("Ratna"));
		System.out.println(UniqueCharactersOfString.checkUniqueCharacters("Ravi"));

		uniqueCharactersJava8();

	}

	private static void uniqueCharactersJava8() {
		String str = "Ratna";
		Set<Character> hasSet = new HashSet<>();
		Optional<Character> findFirst = str.chars().mapToObj(c -> (char) c).filter(x -> !(hasSet.add(x))).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
			System.out.println("duplicate string");
		} else {
			System.out.println("unique string");
		}
	}

	public static boolean checkUniqueCharacters(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (str.indexOf(charAt) != str.lastIndexOf(charAt)) {
				return false;
			}
		}
		return true;
	}

}
