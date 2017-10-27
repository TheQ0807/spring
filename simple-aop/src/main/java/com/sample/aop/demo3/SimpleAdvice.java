package com.sample.aop.demo3;

import org.aspectj.lang.JoinPoint;

public class SimpleAdvice {

	// 대상객체의 메소드가 성공적으로 시행된 후에 실행되는 공통기능
	public void returnning1(JoinPoint jp, Object value) {
		System.out.println("대상메소드가 성공적으로 완료됨: "+ value);
	}
	// 대상 객체의 메소드가 성공/실패 여부와 상관없이 실행 후에 실행되는 공통 기능
	public void returnning2(JoinPoint jp) {
		System.out.println("대상메소드가 완료됨(성공인지? 실패인지? 모름)");
	}
}
