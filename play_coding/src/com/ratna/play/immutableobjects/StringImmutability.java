package com.ratna.play.immutableobjects;

public class StringImmutability {

	public static void main(String[] args) {

		String s1 = "Ratna";
		String s2 = "RatNa";
		String s3 = "Ratna";
		System.out.println(s1.hashCode() == s2.hashCode());

		// doesn't create new string with s3 but points s3 reference to value in string
		// constant pool since string is
		// immutable
		System.out.println(s1.hashCode() == s3.hashCode());
		String s4 = new String("Ratna");
		System.out.println(s4.hashCode() == s3.hashCode());
	}

}
