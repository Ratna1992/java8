package com.ratna.play.designpatterns.dependencyinjection;

public class MyDIApplication implements Consumer {

	private MessageService messageService;

	public MyDIApplication(MessageService messageService) {
		super();
		this.messageService = messageService;
	}

	@Override
	public void processMessages(String msg, String rec) {

		this.messageService.sendMessage(msg, rec);
	}

}
