package com.sample.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo2-resource-context.xml";
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(resource);
		
		MemberServiceImpl service = context.getBean("memberService", MemberServiceImpl.class);
		service.removeAllMember();
		
		context.destroy();
		
		System.out.println("종료.......");
	}
}
