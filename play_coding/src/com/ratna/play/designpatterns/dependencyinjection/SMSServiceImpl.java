package com.ratna.play.designpatterns.dependencyinjection;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		System.out.println("Email sent to " + rec + " with Message=" + msg);

	}

}
