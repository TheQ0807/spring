package com.sample.aop.demo4;

public class SampleServiceImpl implements SampleService {

	public long heavyWork() {
		
		long result = 0;
		
		for(int i = 1; i<=100; i++ ) {
			try{
				Thread.sleep(50);
				result += i;
			} catch (Exception e) {
				
			}
		}
		
		
		return result;
	}
}
