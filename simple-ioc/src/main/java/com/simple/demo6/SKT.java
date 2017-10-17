package com.simple.demo6;

public class SKT implements Telecom{
	
	public void send(String message) {
		System.out.println("["+message+"]SKT망을 이용해서 전송합니다.");
	}
}
