package com.sample.aop.demo3;

public class SimpleServieImpl implements SimpleService {

	public void m1(int x , int y) {
		int result = x/y;
		System.out.println("m1의 핵심 기능이다.");
	}
	public void m2(String msg) {
		int length = msg.length();
		System.out.println("m2의 핵심 기능이다.");
	}
	
	public void m3() {
		System.out.println("m3의 핵심기능이다.");
	}
	
	public int m4(int x, int y) {
		System.out.println("m4의 핵심기능이다.");
		int result = x + y;
		return result;
	}
}
