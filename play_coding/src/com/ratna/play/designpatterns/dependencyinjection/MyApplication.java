package com.ratna.play.designpatterns.dependencyinjection;

public class MyApplication {
	private EmailService email = null;

	public MyApplication(EmailService email) {
		this.email = email;
	}

	public void processMessages(String msg, String rec) {
		// do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}
