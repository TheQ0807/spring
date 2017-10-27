package com.sample.aop.demo4;

public class AlertImpl implements Alert {

	public void notice(String msg) {
		
		System.out.println("경고 메세지["+msg+"]를 관리자에게 발송합니다.");
	}
}
