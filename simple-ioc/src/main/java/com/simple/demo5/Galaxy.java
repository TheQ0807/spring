package com.simple.demo5;

public class Galaxy implements Phone {

	public void sms(String text) {
		System.out.println("["+text+"] Galaxy 로 보냅니다.");
	}
}
