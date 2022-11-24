package com.ratna.play.coding.abstraction;

public class Audience implements Movie, Match {

	private String s = null;

	@Override
	public void view() {
		System.out.println(s);

	}

	public Audience(String s) {
		super();
		this.s = s;
	}

}
