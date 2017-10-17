package com.sample.demo2;

import org.springframework.stereotype.Component;

@Component
public class LineChart implements Chart {

	public void draw() {
		System.out.println("꺾은선 그래프를 출력");
	}
}
