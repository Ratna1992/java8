package com.ratna.play.keywords;

public class StaticKeyword {

	private static String company = "DEV SOFTS";

	private static String location;

	private static String getCompany() {
		return company;
	}

	static {
		location = "Hyderabad";
		System.out.println(location);
		System.out.print(StaticKeyword.getCompany());
	}

	public static void main(String[] args) {

	}

	public StaticKeyword() {

	}
}
