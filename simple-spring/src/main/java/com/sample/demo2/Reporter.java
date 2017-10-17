package com.sample.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Reporter {

	@Autowired
	private Chart chart;
	public void setChart(Chart chart) {
		this.chart = chart;
	}
	
	public void report() {
		System.out.println("보고서를 작성합니다.");
		chart.draw();
	}
}
