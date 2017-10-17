package com.sample.soloDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

	@Autowired
	public Hi hi;
	public void setHi(Hi hi) {
		this.hi = hi;
	}
	
	public void hell() {
		System.out.println("연습입니다.2");
		hi.last();
	}
}
