package com.ratna.play.designpatterns.factory;

public class NotificationsFactory {

	public NotificationFactory createNotification(String channel) {

		{
			if (channel == null || channel.isEmpty())
				return null;
			switch (channel) {
			case "SMS":
				return new SmsNotificationFactory();
			case "EMAIL":
				return new EmailNotificationFactory();
			default:
				throw new IllegalArgumentException("Unknown channel " + channel);
			}
		}
	}
}
