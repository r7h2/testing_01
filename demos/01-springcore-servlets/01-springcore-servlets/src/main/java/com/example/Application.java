package com.example;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		String s1 = ctx.getBean("myStringBean", String.class);
		System.out.println("s1 = " + s1);
		Cat cat1 = ctx.getBean("myCat", Cat.class);
		System.out.println(cat1);
		Dog dog1 = ctx.getBean("myDog", Dog.class);
		System.out.println(dog1);
		
		String[] strArray = ctx.getBeanDefinitionNames();
		Arrays.sort(strArray);
		for( String s : strArray) { 
			System.out.println("bean name: " + s);
		}

		
	}
	
	// @Component @RestController @Service
	@Bean("myStringBean")
	public String getMyString() {
		
		return "Fred";
	}
	
	
	
	
	

}
