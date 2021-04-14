package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	// Java configuration in Spring
	@Bean ("myDog")
	public Dog getMyDog() {
		
		return new Dog("Fluffy");
	}
	

}
