package com.ratna.play.coding.exceptionhandling;

class JavaTpoint {
	void show() {
		System.out.println("It is JavaTpoint section");
	}
}

class SEO extends JavaTpoint {
}

public class NoClassDefFoundErrorExample {
	public static void main(String[] args) {
		SEO data = new SEO();
		// data.showData();
		data.show();
	}
}
