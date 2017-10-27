package com.sample.aop.demo3;

public class HTAException extends RuntimeException {

	// 예외파일을 생성하는 메소드들
	public HTAException(String msg) {
		 System.out.println("대상 메소드에서 예외가 발생됨");
	}
	public HTAException(String msg, Throwable t) {
		super(msg, t);
	}
}
