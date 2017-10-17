package com.simple.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo2-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		AuthService service = context.getBean("authService",AuthService.class);
		service.auth();
	}
}
