package com.example.zrestdemo02;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZRestDemo02Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ZRestDemo02Application.class, args);
		System.out.println("starting app");
		String pet1 = ctx.getBean("spike", String.class);
		String pet2 = ctx.getBean("getPetName01", String.class);
		Cat cat1 = ctx.getBean("myCatSpike", Cat.class);
		Dog dog1 = ctx.getBean("myDogFluffy", Dog.class);
		System.out.println("pet1: " + pet1);
		System.out.println("pet2: " + pet2);
		System.out.println("cat1: " + cat1);
		System.out.println("dog1: " + dog1);
		String[] allBeans = ctx.getBeanDefinitionNames();
		Arrays.sort(allBeans);
		for(String s: allBeans) {System.out.println("bean name: " + s);}
	}
	
	@Bean
	public String getPetName01() {
		return "Fluffy";
	}
	@Bean("spike")
	public String getPetName02() {
		return "Spike";
	}
	@Bean("myCatSpike")
	public Cat createCatSpike() {
		return new Cat(getPetName02());
	}

}
