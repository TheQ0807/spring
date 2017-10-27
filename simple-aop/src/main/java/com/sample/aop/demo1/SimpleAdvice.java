package com.sample.aop.demo1;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class SimpleAdvice {

	public void logging(JoinPoint jp) {
		String targetClassName = jp.getTarget().getClass().getName();
		String methodName = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		
		System.out.println("["+targetClassName+"]" + methodName+"()is Running!");
		System.out.println("Args : " +Arrays.toString(args));
	}
}
