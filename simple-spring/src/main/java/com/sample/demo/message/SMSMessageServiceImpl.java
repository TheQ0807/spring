package com.sample.demo.message;

public class SMSMessageServiceImpl implements MessageService {

	public void send(String from, String to, String text) {
		System.out.println("SMS 발송: ["+from+"] -> ["+to+"]" + text);
	}
}
