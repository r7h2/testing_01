package com.hcl;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ZRestDemo04Application {

	public static void main(String[] args) {
		
		// ctx is the spring container - it has lots of "beans" (Java objects that Spring manages)
		ApplicationContext ctx = SpringApplication.run(ZRestDemo04Application.class, args);
		String s1 = ctx.getBean("myName", String.class);
		System.out.println("my name is: " + s1);
		Cat cat1 = ctx.getBean("myCat", Cat.class);
		System.out.println("my catName is: " + cat1);
		Dog dog1 = ctx.getBean("dog_01", Dog.class);
		System.out.println("my dogName is: " + dog1);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for( String s : beanNames) {System.out.println("bean name: " + s);}
		
	}

	@Bean("myName")
	public String generateName() {
		return "Aaron";
	}
	
	@Bean("dog_01")
	public Dog createDog() {
		
		Dog d1 = new Dog();
		d1.setName(generateName());
		return d1;
	}
}
