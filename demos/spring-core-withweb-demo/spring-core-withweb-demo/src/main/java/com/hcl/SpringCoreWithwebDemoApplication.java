package com.hcl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@ServletComponentScan
@SpringBootApplication
public class SpringCoreWithwebDemoApplication {
	@Autowired
	@Qualifier("secondAnimalName")
	private String dogName;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCoreWithwebDemoApplication.class, args);
		System.out.println("Hello");
		String bean01 = ctx.getBean("myBean", String.class);
		System.out.println("the bean retrieved from spring container: " + bean01);
		System.out.println("firstAnimalName: " + ctx.getBean("secondAnimalName", String.class));
		System.out.println("myCat: + " + ctx.getBean("myCat", Cat.class));
		System.out.println("myDog: " +  ctx.getBean("myDog", Dog.class));
		System.out.println("practice: " + ctx.getBean("createString", String.class));
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName : beanNames) {System.out.println("bean name: " + beanName);}
	}
	
	@Bean("myBean")
	public String myBean() {
		return "mine";
	}
	@Bean("myDog")
	public Dog getDog() {
		Dog d1 = new Dog();
		d1.setName(dogName);
		return d1;
	}
	@Bean
	@Primary
	public String createString() {return "blah";}

}
