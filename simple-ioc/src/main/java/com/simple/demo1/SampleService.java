package com.simple.demo1;

public class SampleService {

	private MailService mailService;
	private int maxMailSize;
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}
	
	public void setMaxMailSize(int maxMailSize) {
		this.maxMailSize = maxMailSize;
	}
	
	
	public SampleService() {}
	public SampleService(MailService mailService, int maxMailSize) {
		this.mailService = mailService;
		this.maxMailSize = maxMailSize;
	}
	
	public void sendMail(String from, String to, String subject, String text) {
		mailService.send(from, to, subject, text);
	}
}
