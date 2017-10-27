package com.sample.aop.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo1-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		SimpleService service = context.getBean(SimpleService.class);
		service.m1(10, 20);
		service.m2("홍길동");
		service.m3();
		
	}
}
