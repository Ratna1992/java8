package com.ratna.play.designpatterns.dependencyinjection;

public class MyMessageDIRunner {

	public static void main(String[] args) {
		String msg = "Hi Ratna";
		String email = "srinivas.ratna.1992@gmail.com";
		String phone = "8499899121";
		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);

	}

}
