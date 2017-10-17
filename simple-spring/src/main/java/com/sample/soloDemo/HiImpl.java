package com.sample.soloDemo;

import org.springframework.stereotype.Component;

@Component
public class HiImpl implements Hi {

	public void last() {
		System.out.println("연습입니다.1");
	}
}
