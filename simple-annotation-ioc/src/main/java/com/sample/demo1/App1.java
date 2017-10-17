package com.sample.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo1-annotation-scan-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		EventServiceImpl service = context.getBean(EventServiceImpl.class);
		service.notice("빅세일");
	}
}
