package com.simple.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo3-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		Pen pen = context.getBean("pen",Pen.class);
		pen.draw();
	}
}
