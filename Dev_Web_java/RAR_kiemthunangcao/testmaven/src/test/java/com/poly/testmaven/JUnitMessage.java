package com.poly.testmaven;

public class JUnitMessage {
	String message;
	public JUnitMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String printMessage() {
		int divine = 1/0;
		return message;
		
	}
	public String printHiMessage() {
		return "Hi!" + message;
	}
	
	
}
