package com.example.zrestdemo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigBeans {
	
	@Bean("rex")
	@Primary
	public Dog createDogRex() {
		Dog d1 = new Dog();
		d1.name = "Rex";
		return d1;
		
	}

}
