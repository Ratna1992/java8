package com.ratna.play.keywords;

class Demo {
	final void run() {

	}
}

final class A extends Demo {

}

//class B extends A{} final class cannot be inherited

public class FinalKeyword extends Demo {
	final String PAN_CARD_NUMBER;

	final int speedlimit = 90;// final variable

	// void run() {
	// speedlimit = 400;
	// final variable cannot be modified
	// }final method cannot be override

	public static void main(String[] args) {
		new FinalKeyword();
	}

	public FinalKeyword() {
		// final variable can be initialized in constructor
		PAN_CARD_NUMBER = "DTRPK1798A";
		System.out.println(PAN_CARD_NUMBER);
	}

}
