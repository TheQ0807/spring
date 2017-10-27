package com.sample.aop.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo3-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		SimpleService service = context.getBean(SimpleService.class);
		
		service.m1(10, 1);
		//service.m4(20, 5);
	}
}
