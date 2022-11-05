package com.ratna.play.designpatterns.dependencyinjection;

public class MyLegacyTest {

	public static void main(String[] args) {
		MyApplication app = new MyApplication(new EmailService());
		app.processMessages("Hi Ratna", "srinivas.ratna.1992@gmail.com");

	}

}
