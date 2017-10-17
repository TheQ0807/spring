package com.simple.demo5;

public class IPhone implements Phone{

	public void sms(String text) {
		System.out.println("["+text+"]를 IPhone 로 보냅니다요");
	}
}
