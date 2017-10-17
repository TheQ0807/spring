package com.sample.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EventServiceImpl {
	
	@Autowired
	@Qualifier("katalk")
	private MessageSender messageSender;
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void notice(String message) {
		messageSender.send(message);
	}
}
