package com.sample.aop.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/demo4-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		SampleService service = context.getBean(SampleService.class);
		
		long result = service.heavyWork();
		System.out.println(result);
	}
}
// 소스의 가독성이 좋음
// 중복코드 제거
// 생산성 향상
// 재사용성 향상
// 변경 용이성 증대
