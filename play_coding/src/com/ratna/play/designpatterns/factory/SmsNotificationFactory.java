package com.ratna.play.designpatterns.factory;

//factory design pattern
public class SmsNotificationFactory implements NotificationFactory {

	@Override
	public void notifyUser() {
		System.out.println("SmS notifications");

	}

}
