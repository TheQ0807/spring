package com.sample.demo.event;

import com.sample.demo.notice.NoticeService;

public class EventService {

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	public void newEventNotice() {
		noticeService.notice("추석상품 떨이 판매", "추석 재고 상품을 80% 할인된 가격으로 10월 11일 하루 한정 판매합니다.");
	}
}
