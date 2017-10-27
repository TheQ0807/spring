package com.sample.aop.demo2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SimpleAdvice {

	@Pointcut("bean(*Service)")
	public void mypointcut() {}
	
	@Before("mypointcut()")
	public void logging() {
		System.out.println("공통기능이다.");
	}
}
