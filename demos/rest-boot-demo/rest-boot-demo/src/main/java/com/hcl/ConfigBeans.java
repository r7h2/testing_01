package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hcl.model.Greeting;

@Configuration
public class ConfigBeans {
	
	@Bean("helloString")
	public String makeFirstStringGreeting() {
		return "Hello, there!";
	}
	@Bean("byeString")
	public String makeSecondStringGreeting() {
		return "GoodBye";
	}
	
	@Bean("greeting_01")
	public Greeting genFirstGreeting() {
		return new Greeting(9, makeFirstStringGreeting());
	}
	@Bean("greeting_02")
	public Greeting genSecondGreeting() {
		return new Greeting(53, makeSecondStringGreeting());
	}
}
