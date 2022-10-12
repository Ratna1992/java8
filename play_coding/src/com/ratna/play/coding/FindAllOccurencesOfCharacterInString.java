package com.ratna.play.coding;

public class FindAllOccurencesOfCharacterInString {

	public static void main(String[] args) {
		String str = "ratna";
		long count = str.codePoints().filter(ch->ch == 'a').count();
		System.out.println(count);
		
		long count1 = str.chars().filter(ch->ch == 'a').count();
		System.out.println(count1);

	}

}
