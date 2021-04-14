package com.example.zrestdemo02.controller;

public class Greeting {
	private String message;
	
	

	public Greeting(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Greeting [message=" + message + "]";
	}
	
	

}
