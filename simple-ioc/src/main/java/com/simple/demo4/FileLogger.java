package com.simple.demo4;

public class FileLogger {

	private String directory;
	private String filename;
	
	
	
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public FileLogger() {}
	
	public FileLogger(String directory, String filename) {
		this.directory = directory;
		this.filename = filename;
	}

	public void write(String text) {
		System.out.println("["+text+"]를 파일로 기록하기...");
	}
}
