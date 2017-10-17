package com.sample.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo.event.EventService;

public class App {

	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/app-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		EventService event = context.getBean("eventService", EventService.class);
		event.newEventNotice();
		
	}
}
