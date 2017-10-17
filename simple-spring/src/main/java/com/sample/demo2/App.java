package com.sample.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context2.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		Reporter reporter = context.getBean(Reporter.class);
		reporter.report();
	}
}
