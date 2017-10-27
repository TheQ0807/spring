package com.sample.aop.demo3;

import org.aspectj.lang.JoinPoint;

public class ExceptionTransfer {

	// 예외발생 시키는 메소드
	public void transfer(JoinPoint jp, Exception ex) {
		
		System.out.println("예외발생["+ex.getMessage()+"]");
		throw new HTAException(ex.getMessage(), ex.getCause());
	}
}
