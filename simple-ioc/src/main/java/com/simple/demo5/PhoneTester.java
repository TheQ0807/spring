package com.simple.demo5;

import java.util.Set;

public class PhoneTester {
	
	Set<Phone> phones;
	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	
	public void test() {
		
		for(Phone p : phones) {
			p.sms("연습");
		}
	}
}
