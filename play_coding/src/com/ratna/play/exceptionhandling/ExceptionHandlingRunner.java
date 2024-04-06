package com.ratna.play.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
		p.calculate(10, 20, 30, 40);
		p.calculate(10, 20);
		p.calculate(10, 20, 30);

		Voter v1 = new Voter(17);
		if (v1.getAge() < 18) {
			throw new AgeException("no voting access");
		}
	}

}
