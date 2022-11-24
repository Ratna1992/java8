package com.ratna.play.abstraction;

public class InterfaceRunner {

	public static void main(String[] args) {
		Movie a = new Audience("watching movie");
		a.view();
		Audience b = new Audience("watching match");
		b.view();

	}

}
