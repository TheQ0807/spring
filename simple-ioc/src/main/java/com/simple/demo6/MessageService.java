package com.simple.demo6;

import java.util.Map;

public class MessageService {

	Map<String, Telecom> telecomMap;
	public void setTelecomMap(Map<String, Telecom> telecomMap) {
		this.telecomMap = telecomMap;
	}
	
	public void sendMessage(String message, String telecom) {
		Telecom company =  telecomMap.get(telecom);
		if(company != null) {
			company.send(message);
		}
	}
}
