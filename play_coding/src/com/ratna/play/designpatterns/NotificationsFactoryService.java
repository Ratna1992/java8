package com.ratna.play.designpatterns;

public class NotificationsFactoryService {

	public static void main(String[] args) {

		NotificationsFactory notificationsFactory = new NotificationsFactory();
		NotificationFactory createNotification = notificationsFactory.createNotification("SMS");
		createNotification.notifyUser();

	}

}
