package com.hcl;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class ZRestDemo03Application {

	public static void main(String[] args) {
		ApplicationContext ctx =   SpringApplication.run(ZRestDemo03Application.class, args);
		String catName1 = ctx.getBean("myFluffy",String.class);
		String catName2 = ctx.getBean("getSpike",String.class);
		Cat cat1 = ctx.getBean("myCat", Cat.class);
		Dog dog1 = ctx.getBean("dog_01", Dog.class);
		System.out.println("catname1 = " + catName1);
		System.out.println("catname2 = " + catName2);
		System.out.println("cat1 = " + cat1);
		System.out.println("dog1 = " + dog1);
		
		String[] allBeans = ctx.getBeanDefinitionNames();
		Arrays.sort(allBeans);
		for(String s : allBeans) {System.out.println("bean name: " + s);}
	}
	
	@Bean("myFluffy")
	//@Primary
	public String getCatName() {
		return "Fluffy";
	}
	@Bean
	//@Primary
	public String getSpike() {
		return "spike";
	}
	@Bean("myCat")
	public Cat makeNewFluffyCat() {
		
		return new Cat(getCatName());
	}
	

}
