package com.ratna.play.designpatterns;

public class SmsNotificationFactory implements NotificationFactory {

	@Override
	public void notifyUser() {
		System.out.println("SmS notifications");

	}

}
