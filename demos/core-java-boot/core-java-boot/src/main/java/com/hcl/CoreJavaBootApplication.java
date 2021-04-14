package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreJavaBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreJavaBootApplication.class, args);
		System.out.println("hello");
		String myBean = ctx.getBean("myBean", String.class);
		System.out.println("here is the string object retrieved from spring container: " + myBean);
		
	}
	@Bean("myBean")
	public String getString() {
		return "mine";
	}

}
