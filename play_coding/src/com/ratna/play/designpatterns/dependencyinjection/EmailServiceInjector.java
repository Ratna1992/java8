package com.ratna.play.designpatterns.dependencyinjection;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyDIApplication(new EmailServiceImpl());
	}

}
