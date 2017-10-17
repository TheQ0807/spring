package com.simple.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/demo5-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		PhoneTester tester = context.getBean("tester1", PhoneTester.class);
		tester.test();
		
	}
}
