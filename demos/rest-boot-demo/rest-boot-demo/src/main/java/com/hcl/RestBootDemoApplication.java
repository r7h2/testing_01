package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RestBootDemoApplication.class, args);
		System.out.println(ctx.getBean("greeting_01"));
	}

}
