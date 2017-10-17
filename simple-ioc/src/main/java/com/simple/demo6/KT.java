package com.simple.demo6;

public class KT implements Telecom{

	public void send(String message) {
		System.out.println("["+message+"]KT망을 이용해서 전송합니다.");
	}
}
