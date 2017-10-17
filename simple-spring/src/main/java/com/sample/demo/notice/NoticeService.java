package com.sample.demo.notice;

import com.sample.demo.message.MessageService;

public class NoticeService {

	private MessageService messageService;
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void notice(String title, String contents) {
		
		messageService.send("관리자", "김유신", " 제목: "+title+" 내용: "+contents);
		messageService.send("관리자", "강감찬", " 제목: "+title+" 내용: "+contents);
		messageService.send("관리자", "이순신", " 제목: "+title+" 내용: "+contents);
		
	}
}
