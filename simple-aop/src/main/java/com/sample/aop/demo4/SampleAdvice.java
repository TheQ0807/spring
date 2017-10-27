package com.sample.aop.demo4;

import org.aspectj.lang.ProceedingJoinPoint;

public class SampleAdvice {

	
	private Alert alert;
	public void setAlert(Alert alert) {
		this.alert = alert;
	}
	
	// 어라운드 스로우는 프로시딩 조인포인트가 필수적이다 또한 런닝타임체크또한 필수로 있어야한다.
	// 리턴값도 조절할수있고 여러기능이 있기때문에 반환값이 무조건 있어야한다. 반환을 해주지 않으면 반환값이 나오지 않는다. 
	public Object runningTimeCheck(ProceedingJoinPoint jp) throws Throwable {
		Object obj = 0;
		
		// 대상 메소드 실행 전 코드
		System.out.println("대상 메소드 실행전 공통코드 실행...");
		long beginTime = System.currentTimeMillis();
		
		// 대상 메소드 실행 하는 코드
		obj = jp.proceed();
		
		// 대상 메소드 실행 후 코드
		System.out.println("대상 메소드 실행 후 공통 코드 실행...");
		long endTime = System.currentTimeMillis();
		long runningTime = endTime - beginTime;
		if(runningTime > 3000) {
			alert.notice("실행 소요시간 초과");
		}
		
		return obj;
	}
}
