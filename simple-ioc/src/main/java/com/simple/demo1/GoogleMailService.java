package com.simple.demo1;

public class GoogleMailService implements MailService {

	private String username;
	private String password;
	private int port;
	private String host;
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	
	private void connect() {
		System.out.println("메일서버 접속");
	}
	
	public void send(String from, String to, String subject, String text) {
		
	}
}
