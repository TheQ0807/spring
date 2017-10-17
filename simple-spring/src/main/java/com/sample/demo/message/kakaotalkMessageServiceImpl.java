package com.sample.demo.message;

public class kakaotalkMessageServiceImpl implements MessageService {

	public void send(String from, String to, String text) {
		System.out.println("카톡 발송: ["+from+"] -> ["+to+"]" + text);
	}
}
