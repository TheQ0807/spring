package com.simple.demo6;

public class LG implements Telecom{

	public void send(String message) {
		System.out.println("["+message+"]LG망을 이용해서 전송합니다.");
	}
}
