package com.sample.soloDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		String source = "classpath:/META-INF/spring/app-context3.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(source);
		Hello hello = context.getBean(Hello.class);
		hello.hell();
	}
}
