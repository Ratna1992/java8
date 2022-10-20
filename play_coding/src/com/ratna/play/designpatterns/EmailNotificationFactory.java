package com.ratna.play.designpatterns;

public class EmailNotificationFactory implements NotificationFactory {

	@Override
	public void notifyUser() {
		System.out.println("Email Notification Factory");
	}

}
